package com.prince.jsondatacreator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.jsondatacreator.model.JsonModel;
import com.prince.jsondatacreator.repository.JsonModelRepository;
import com.prince.jsondatacreator.utils.JsonModelException;

@Service
public class JsonModelService {

	@Autowired
	private JsonModelRepository repository;
	
	public List<JsonModel> getAllJsonModels() {		
		return repository.findAll();
	}

	public JsonModel getJsonModelbyName(String name) {
		Optional<JsonModel> optionalModel = repository.findById(name);
		return optionalModel.isPresent()? optionalModel.get() : null;
	}

	public JsonModel createJsonModel(JsonModel jsonModel) throws JsonModelException {
		if(repository.existsById(jsonModel.getName())) {
			throw new JsonModelException("JSON Model already exists with name: "+ jsonModel.getName());
		}
		return repository.save(jsonModel);
	}

	public JsonModel updateOrCreateJsonModel(JsonModel jsonModel) {
		return repository.save(jsonModel);
	}

	public void deleteJsonModel(String name) {
		if(!repository.existsById(name)) {
			throw new JsonModelException("JSON Model does not exist with name: "+ name);
		}
		repository.deleteById(name);
	}
	
	

}
