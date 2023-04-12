package com.springboot.jpa.repository;

import java.util.List;

import com.springboot.jpa.model.Student;

public interface StudentRepository {
	
	public void saveStud(Student s);
	void updateStud(int r,float p);
	void deleteStud(int r);
	List<Student> viewAll();

}
