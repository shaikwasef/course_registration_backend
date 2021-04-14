package io.shaikwasef.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	 private String id;
	 
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
	}
	
	public Topic() {

	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		 
	 
}
