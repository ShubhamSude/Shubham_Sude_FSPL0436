package com.SpringDemo.EmployeeManagmentSystem.controller;

import com.SpringDemo.EmployeeManagmentSystem.dto.DepartmentDto;
import com.SpringDemo.EmployeeManagmentSystem.entity.Department;
import com.SpringDemo.EmployeeManagmentSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping("/employeemanagement")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public ResponseEntity<Department> addDepartmentData(@RequestBody DepartmentDto departmentDto)
    {
        return new ResponseEntity<>(departmentService.addDepartmentData(departmentDto),CREATED);
    }

    @GetMapping("/getDepartment")
    public ResponseEntity<List<Department>> getDepartmentData(){
        return new ResponseEntity<>(departmentService.getDepartmentData(),FOUND);
    }

}
