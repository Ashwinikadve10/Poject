package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/view")
public class StudentController {
	@Autowired
    private StudentRepository studentRepository;
 
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
 
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
 
    @DeleteMapping("/{rollno}")
    public void deleteStudent(@PathVariable int rollno) {
        studentRepository.deleteByrollno(rollno);
    }
 
    @PostMapping("/{id}")
    public Student updateStudent(@PathVariable int rollno, @RequestBody Student student) {
        student.setrollno(rollno);
        return studentRepository.save(student);
    }

}
