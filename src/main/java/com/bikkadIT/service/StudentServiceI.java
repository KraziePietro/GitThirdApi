package com.bikkadIT.service;

import java.util.List;

import com.bikkadIT.model.Student;

public interface StudentServiceI {

	public int addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Integer id);
}
