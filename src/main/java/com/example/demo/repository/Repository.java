package com.example.demo.repository;
import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.model.Stud;



public interface Repository extends MongoRepository<Stud, String>
{
Stud save(Stud studen);
List<Stud> findAll();
@Query(value="{'studroll' :?0}")
Stud findBystudroll(String studroll);


}
