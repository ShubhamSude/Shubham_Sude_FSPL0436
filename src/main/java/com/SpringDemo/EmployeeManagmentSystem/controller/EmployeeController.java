package com.SpringDemo.EmployeeManagmentSystem.controller;

import com.SpringDemo.EmployeeManagmentSystem.dto.EmployeeDto;
import com.SpringDemo.EmployeeManagmentSystem.entity.Employee;
import com.SpringDemo.EmployeeManagmentSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/employeemanagement")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addData(@RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(employeeService.addData(employeeDto),CREATED);
    }
}
