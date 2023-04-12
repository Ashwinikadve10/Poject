package com.springboot.jdbc.repository;

import java.util.List;

import com.springboot.jdbc.model.Product;

public interface ProductRepository {
	public int saveproduct(Product p);
	public int updateProduct(int i,float c,int q);
	public int deleteProduct(int i);
	public List<Product>viewAllProduct();
	

}
