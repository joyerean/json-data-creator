package com.prince.jsondatacreator.model;

import java.sql.Date;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonModel {

	private String name;
	
	private ObjectNode model;
	
	private Date lastUpdated;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectNode getModel() {
		return model;
	}

	public void setModel(ObjectNode model) {
		this.model = model;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
