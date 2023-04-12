package com.springboot.jdbc.model;

import java.io.Serializable;

public class Product implements Serializable 
{
	private int id;
	private String name;
	private String brand;
	private float cost;
	private int quantity;
	public Product(){}
	public Product(int id, String name, String brand, float cost, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.cost = cost;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString()
	{
		return id+" "+name+" "+brand+" "+cost+" "+quantity;
	}
	

}
