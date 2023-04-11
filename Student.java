package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;
 
    @Column(name = "name")
    private String name;
 
    @Column(name = "degree")
    private String degree;
 
    @Column(name = "per")
    private String per;
    
    
    // Constructor, getters and setters
    
    public Student() {
		super();
	}


	public Student(int rollno, String name, String degree, String per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.degree = degree;
		this.per = per;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getPer() {
		return per;
	}


	public void setPer(String per) {
		this.per = per;
	}


	public void setrollno(int rollno2) {
		// TODO Auto-generated method stub
		
	}
	

 
    
    
    
}