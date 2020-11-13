package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Stud;
@Service
public interface Servicestudent {
Stud save(Stud studen);
 List<Stud>findAll();
List<Stud> findBystudroll();
 
}
