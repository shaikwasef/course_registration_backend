package io.shaikwasef.springbootstarter.registeredCourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.shaikwasef.springbootstarter.student.Student;

@RestController
public class RegisteredCourseController {
	
	@Autowired
	private RegisteredCourseService registeredCourseService ;
	
	@RequestMapping("/students/{studentId}/courses")
	public List<RegisteredCourse> getAllRegisteredCourses(@PathVariable String studentId){
		return registeredCourseService.getAllRegisteredCourses(studentId);
	}
	
	@PostMapping("/students/{studentId}/courses")
	public void addCourse(@RequestBody RegisteredCourse course, @PathVariable String studentId){
		course.setStudentId(studentId);
		registeredCourseService.addCourse(course);
	}
	
}
