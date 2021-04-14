package io.shaikwasef.springbootstarter.registeredCourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.shaikwasef.springbootstarter.student.Student;

@Service
public class RegisteredCourseService {
	
	@Autowired
	private RegisteredCourseRepository RegisteredCourseRepo ;

	public List<RegisteredCourse> getAllRegisteredCourses(String studentId) {
		List<RegisteredCourse> registeredList = new ArrayList<RegisteredCourse>();
		RegisteredCourseRepo.findAll().forEach(value -> {
		    if(value.getStudentId().equals(studentId)) {
		    	registeredList.add(value);
		    };
		});
		return registeredList;
	}

	public void addCourse(RegisteredCourse course) {
		RegisteredCourseRepo.save(course);
	}
	
	
}
