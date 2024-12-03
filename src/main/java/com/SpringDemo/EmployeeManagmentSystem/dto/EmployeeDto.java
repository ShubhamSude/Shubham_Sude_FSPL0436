package com.SpringDemo.EmployeeManagmentSystem.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class EmployeeDto {

    private String employeeFirstName;
    private String employeeLastName;
    private  int employeeAge;
    private String employeeEmail;
    private String dateOfJoining;
    private double employeeSalary;
    private long employeeMobileNumber;
    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private  String updatedBy;
    private  LocalDateTime updatedDate;

}
