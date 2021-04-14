package io.shaikwasef.springbootstarter.registeredCourse;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.shaikwasef.springbootstarter.student.Student;

@Entity
public class RegisteredCourse {
	@Id
	private String courseId;
	private String topicId ;
	private String studentId;
//	@ManyToOne
//	private Student student;
//	
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	public RegisteredCourse(String courseId, String topicId , String studentId ) {
		super();
		this.courseId = courseId;
		this.topicId = topicId;
		this.studentId = studentId;
//		this.setStudent(new Student(studentId,""));
	}
	public RegisteredCourse() {
			
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
}
