package com.rj.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDao {

    @Autowired
    EmployeeRepository repository;

    public Employee save(Employee e) {
        return repository.save(e);
    }

    public List<Employee> findAll() {
       return repository.findAll();
    }
}
