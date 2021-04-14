package io.shaikwasef.springbootstarter.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<Student>();
		studentRepository.findAll().forEach(studentList :: add );
		return studentList;
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}


}
