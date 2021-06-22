package com.vm.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vm.spring.entity.*;

@Repository
public interface StudentRepo extends CrudRepository <Student, Long> { 
    List<Student> findByName(String name); 
}