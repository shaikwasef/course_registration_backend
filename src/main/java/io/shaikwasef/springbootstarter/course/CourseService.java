package io.shaikwasef.springbootstarter.course;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRespository courseRespository ;
	
	
	public List<Course> getAllCourses(String id) {
		List<Course> topicList = new ArrayList<>();
		courseRespository.findByTopicId(id).forEach(topicList :: add);
		return topicList;
	}
	 
	public Course getCourse(String id) {
//		return result.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRespository.findById(id).get();
		
	}
	
	public void addCourse(Course course) {
		courseRespository.save(course);
	}

	public void updateCourse(Course course) {
		courseRespository.save(course);
	}

	public void deleteCourse(String id) {
		courseRespository.deleteById(id);
	}

	
	
}
