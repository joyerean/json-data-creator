package com.prince.jsondatacreator.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prince.jsondatacreator.model.JsonModel;
import com.prince.jsondatacreator.service.JsonModelService;

@RestController(value = "/api/jsonModel")
public class JsonModelController {
	
	@Autowired
	private JsonModelService jsonModelService;
	
	@GetMapping(path = "")
	public List<JsonModel> getAllJsonModels() {
		return jsonModelService.getAllJsonModels();
	}
	
	@GetMapping(path = "/{name}")
	public JsonModel getJsonModelbyName(@PathVariable String name) {
		return jsonModelService.getJsonModelbyName(name);
	}
	
	@PostMapping(path = "")
	public JsonModel createJsonModel(@RequestBody JsonModel jsonModel) {
		return jsonModelService.createJsonModel(jsonModel);
	}
	
	@PutMapping(path = "")
	public JsonModel updateOrCreateJsonModel(@RequestBody JsonModel jsonModel) {
		return jsonModelService.updateOrCreateJsonModel(jsonModel);
	}
	
	@DeleteMapping(path = "/{name}")
	public void deleteJsonModel(@PathVariable String name) {
		jsonModelService.deleteJsonModel(name);
	}

}
