package com.springboot.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.model.Student;
import com.springboot.jpa.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	StudentRepository sr;
	public void setSr(StudentRepository sr) {
		this.sr = sr;
	}

	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		sr.saveStud(s);
		
	}

	@Override
	public void updateStudent(int r, float p) {
		// TODO Auto-generated method stub
		sr.updateStud(r, p);
	}

	@Override
	@Transactional
	public void deleteStudent(int r) {
		// TODO Auto-generated method stub
		sr.deleteStud(r);
		
		
	}

	@Override
	@Transactional
	public List<Student> viewAllStudent() {
		// TODO Auto-generated method stub
		return sr.viewAll();
	}

}
