package com.springboot.jdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.jdbc.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository
{
	@Autowired
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int saveproduct(Product p) {
		
		return jt.update("insert into product values(?,?,?,?,?)",p.getId(),p.getName(),p.getBrand(),p.getCost(),p.getQuantity());
	}

	@Override
	public int updateProduct(int i, float c, int q) {
		
		return jt.update("update product set cost=? , quantity=? where id=?", c,q,i);
	}

	@Override
	public int deleteProduct(int i) {
		
		return jt.update("delete from product where id=?",i);
	}

	@Override
	public List<Product> viewAllProduct() {
		return jt.query("select * from product",new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setBrand(rs.getString("brand"));
				p.setCost(rs.getFloat("cost"));
				p.setQuantity(rs.getInt("quantity"));
				return p;
				
			}
		});
	}

}
