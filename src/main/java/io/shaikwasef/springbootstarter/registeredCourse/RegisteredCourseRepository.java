package io.shaikwasef.springbootstarter.registeredCourse;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RegisteredCourseRepository extends CrudRepository<RegisteredCourse,String>{
//	public List<RegisteredCourse> findByStudentId(String id);
}
