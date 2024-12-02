package com.SpringDemo.EmployeeManagmentSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "EmployeeInfo")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private  int employeeAge;
    private String employeeEmail;
    private String dateOfJoining;
    private String employeeSalary;
    private Long employeeMobileNumber;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private  String updatedBy;
    private  LocalDateTime updatedDate;



}
