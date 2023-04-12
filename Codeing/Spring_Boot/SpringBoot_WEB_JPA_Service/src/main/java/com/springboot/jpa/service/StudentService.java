package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.model.Student;

public interface StudentService 
{
	void saveStudent(Student s);
	void updateStudent(int r,float p);
	void deleteStudent(int r);
	List<Student> viewAllStudent();
	

}
