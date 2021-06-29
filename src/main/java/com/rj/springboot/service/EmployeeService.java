package com.rj.springboot.service;

import com.rj.springboot.dao.EmployeeDao;
import com.rj.springboot.dao.Employee;
import com.rj.springboot.model.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao dao;

    public Employee saveEmployee(EmployeeBean bean) {
        Employee e = new Employee();
        e.setAge(bean.getAge());
        e.setName(bean.getName());
      return  dao.save(e);
    }

    public List<Employee> findAllEmploye() {
      return  dao.findAll();
    }
}
