package io.shaikwasef.springbootstarter.student;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	private String id;
	private String name;
	
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String studentId) {
		this.id = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
