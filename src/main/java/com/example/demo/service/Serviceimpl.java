package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Stud;

public class Serviceimpl implements Servicestudent

{
private Serviceimpl serviceimpl; 
	@Override
	public Stud save(Stud studen) {
		// TODO Auto-generated method stub
		return serviceimpl.save(studen);
	}

	@Override
	public List<Stud> findAll() {
		// TODO Auto-generated method stub
		return serviceimpl.findAll();
	}

	//@Override
	@Override
	public List<Stud> findBystudroll() {
		// TODO Auto-generated method stub
		return serviceimpl.findBystudroll();
	}



	
	

	
	

}
