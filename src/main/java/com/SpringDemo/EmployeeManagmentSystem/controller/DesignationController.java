package com.SpringDemo.EmployeeManagmentSystem.controller;

import com.SpringDemo.EmployeeManagmentSystem.dto.DesignationDto;
import com.SpringDemo.EmployeeManagmentSystem.entity.Designation;
import com.SpringDemo.EmployeeManagmentSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/employeemanagement")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/addDesignation")
    public ResponseEntity<Designation> addDesignation(@RequestBody DesignationDto designationDto)
    {
        return new ResponseEntity<>(designationService.addDesignation(designationDto),CREATED);
    }

}
