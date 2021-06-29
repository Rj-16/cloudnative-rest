package com.rj.springboot.controller;

import com.rj.springboot.dao.Employee;
import com.rj.springboot.model.EmployeeBean;
import com.rj.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/emp-res", produces = "application/hal+json")
public class EmployeeResponseEntityController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeBean e){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(e), HttpStatus.CREATED);

    }

    @GetMapping
    private ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(employeeService.findAllEmploye());
    }
    
}
