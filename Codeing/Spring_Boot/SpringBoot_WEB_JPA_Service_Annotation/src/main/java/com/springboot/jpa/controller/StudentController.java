package com.springboot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.model.Student;
import com.springboot.jpa.service.StudentService;

@RestController
@RequestMapping(path="/")
public class StudentController 
{
	@Autowired
	StudentService ss;

	public void setSs(StudentService ss) {
		this.ss = ss;
	}
	
	//RESTfull service-----using postman tool
	
	@GetMapping(path="/view")
	public List<Student> viewAll()
	{
		return ss.viewAllStudent();
	}
	
	@PostMapping(path="/save")
	public String Saves(@RequestBody Student s)
	{
		ss.saveStudent(s);
		return "inserted";
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String deletes(@PathVariable int id)
	{
		ss.deleteStudent(id);
		return "deleted";
	}
	
	@PutMapping(path="/update/{i}/{p}")
	public String updates(@PathVariable int i,@PathVariable float p)
	{
		ss.updateStudent(i, p);
		return "updated";
	}

}
