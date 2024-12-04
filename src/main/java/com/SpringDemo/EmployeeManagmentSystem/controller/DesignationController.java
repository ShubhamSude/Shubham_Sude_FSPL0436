package com.SpringDemo.EmployeeManagmentSystem.controller;

import com.SpringDemo.EmployeeManagmentSystem.dto.DesignationDto;
import com.SpringDemo.EmployeeManagmentSystem.entity.Designation;
import com.SpringDemo.EmployeeManagmentSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping("/employeemanagement")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/addDesignation")
    public ResponseEntity<Designation> addDataDesignation(@RequestBody DesignationDto designationDto)
    {
        return new ResponseEntity<>(designationService.addDataDesignation(designationDto),CREATED);
    }

    @GetMapping("/getDesignation")
    public ResponseEntity<List<Designation>> getDesignationData()
    {
        return new ResponseEntity<>(designationService.getDesignationData(),FOUND);
    }
}
