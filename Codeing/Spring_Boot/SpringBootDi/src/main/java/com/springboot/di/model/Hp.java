package com.springboot.di.model;

import org.springframework.stereotype.Component;

import com.springboot.di.inter.HardDisk;

@Component
public class Hp implements HardDisk
{

	@Override
	public void disc() {
		// TODO Auto-generated method stub
		System.out.println("Shape of Hard Disk is Ractangular");
	}
	

}
