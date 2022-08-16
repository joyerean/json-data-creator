package com.prince.jsondatacreator.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;
import com.prince.jsondatacreator.model.JsonModel;
import com.prince.jsondatacreator.model.Person;

@Service
public class JsonDataCreatorService {

	public Object createJsonData(JsonModel model, long count) {
		Faker faker = new Faker();
		return null;
	}
	
	public Map<String, Person> createRandomJsonData(long count) {
		Map<String, Person> personMap = new HashMap<>();
		Faker faker = new Faker();
		for(long i = 0; i < count; i++) {
			Person person = new Person();
			person.setFullName(faker.name().fullName());
			person.setFirstName(faker.name().firstName());
			person.setLastName(faker.name().lastName());
			person.setAddress(faker.address().fullAddress());
			personMap.put(person.getFullName(), person);
		}
		return personMap;
	}
}
