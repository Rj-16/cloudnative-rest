package com.rj.springboot.controller;

import com.rj.springboot.dao.Employee;
import com.rj.springboot.model.EmployeeBean;
import com.rj.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/employee")
    public Employee createEmployee(@RequestBody EmployeeBean e){
        System.out.println(e);
       return employeeService.saveEmployee(e);
    }

    @GetMapping(path = "/employee")
    private List<Employee> getAll(){
        return employeeService.findAllEmploye();
    }

}
