package com.springboot.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jdbc.model.Product;
import com.springboot.jdbc.repository.ProductRepository;

@RestController
@RequestMapping(path="/")
public class ProductController 
{
	
	@Autowired
	ProductRepository pr;

	public void setPr(ProductRepository pr) {
		this.pr = pr;
	}
	
	Scanner sc=new Scanner(System.in);
	
	@RequestMapping(path="/save")
	public String saveP()
	{
		System.out.println("Enter the id,name,brand,cost and quantity");
		int id=sc.nextInt();
		String n=sc.next();
		String b=sc.next();
		float c=sc.nextFloat();
		int q=sc.nextInt();
		
		Product p=new Product(id,n,b,c,q);
		int x=pr.saveproduct(p);
		if(x>0)
		return "Record inserted";
		else
			return "error";
		
	}
	@RequestMapping(path="/d")
	public String deleteP()
	{
		System.out.println("Enter the id");
		int id=sc.nextInt();
		int x=pr.deleteProduct(id);
		if(x>0)
			return "Record Deleted";
		else
			
			return "error";
	}
	
	
	@RequestMapping(path="/up")
	public String updateP()
	{
		System.out.println("Enter the id cost and quantity");
		int id=sc.nextInt();
		float c=sc.nextFloat();
		int q=sc.nextInt();
		
		
		int x=pr.updateProduct(id, c, q);
		if(x>0)
			return "Record Updated";
		else
			return "error";

		
	}
	
	@RequestMapping(path="/view")
	public List<Product> viewP()
	{
		return pr.viewAllProduct();
	}
	
	
	

}
