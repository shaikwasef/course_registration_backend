package io.shaikwasef.springbootstarter.course;


import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.ManyToOne;

import io.shaikwasef.springbootstarter.topic.Topic;

@Entity
public class Course {
	@Id
	 private String id;
	 
	 @ManyToOne
	 private Topic topic ;
	 
	public Course(String id , String topicId) {
		super();
		this.id = id;
		this.setTopic(new Topic(topicId , "" , ""));
	}
	
	public Course() {

	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
		 
	 
}
