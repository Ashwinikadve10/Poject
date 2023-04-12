package com.springboot.di.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.di.inter.HardDisk;

@Component
public class Laptop 
{
	@Autowired
	HardDisk hp;

	
	public void setHp(HardDisk hp) {
		this.hp = hp;
	}
	
	public void show()
	{
		System.out.println("Laptop Class");
		hp.disc();
	}
	

}
