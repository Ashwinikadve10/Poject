package com.springboot.jpa.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.jpa.model.Student;
import com.springboot.jpa.service.StudentService;

public class StudentController 
{
	
	@Autowired
	StudentService ss;
	public void setSs(StudentService ss) {
		this.ss = ss;
	}
	
	Scanner sc=new Scanner(System.in);
	
	@RequestMapping(path="/save")
	public String saveS()
	{
		System.out.println("Enter the roll,name,degree,per");
		Student s=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextFloat());
		ss.saveStudent(s);
		return "inserted";
	}
	
	@RequestMapping(path="/update")
	public String updateS()
	{
		System.out.println("Enter the roll per");
		ss.updateStudent(sc.nextInt(),sc.nextFloat());
		return "updated";
	}
	@RequestMapping(path="/delete")
	
		public String  deleteS()
		{
			System.out.println("Enter the roll");
			ss.deleteStudent(sc.nextInt());
			return null;
		}
		
	@RequestMapping(path="/fetch")
	public List<Student> viewS()
	{
		return ss.viewAllStudent();
	}
	

}
