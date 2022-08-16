package com.prince.jsondatacreator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.prince.jsondatacreator.model.JsonModel;

@Repository
public interface JsonModelRepository extends MongoRepository<JsonModel, String> {

}
