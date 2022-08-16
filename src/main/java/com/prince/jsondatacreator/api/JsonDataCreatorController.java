package com.prince.jsondatacreator.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prince.jsondatacreator.model.Person;
import com.prince.jsondatacreator.service.JsonDataCreatorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "creator", description = "Data Creator endpoints")
@RestController(value = "/api/jsonDataCreator")
public class JsonDataCreatorController {
	
	@Autowired
	private JsonDataCreatorService dataCreatorService;
	
	@Operation(summary = "Create random person data with a given count")
	@GetMapping(path = "/getRandomData")
	public Map<String, Person> getRandomJsonData(@RequestParam long count) {
		return dataCreatorService.createRandomJsonData(count);
	}

}
