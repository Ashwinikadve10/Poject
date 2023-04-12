package com.springboot.jpa.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sb_stub")
public class Student implements Serializable {
	
@Id
	private int roll;
	private String name;
	private String degree;
	private float per;
	
	public Student(){}
	public Student(int roll, String name, String degree, float per) {
		super();
		this.roll = roll;
		this.name = name;
		this.degree = degree;
		this.per = per;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	
	
	

}
