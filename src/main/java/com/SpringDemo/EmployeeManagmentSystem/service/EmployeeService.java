package com.SpringDemo.EmployeeManagmentSystem.service;

import com.SpringDemo.EmployeeManagmentSystem.dto.EmployeeDto;
import com.SpringDemo.EmployeeManagmentSystem.entity.Employee;
import com.SpringDemo.EmployeeManagmentSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee addData(EmployeeDto employeeDto) {
        Employee employee=new Employee();
       employee.setEmployeeId(0L);
       employee.setEmployeeFirstName(employeeDto.getEmployeeFirstName());
       employee.setEmployeeLastName(employeeDto.getEmployeeLastName());
       employee.setEmployeeAge(employeeDto.getEmployeeAge());
       employee.setEmployeeEmail(employeeDto.getEmployeeEmail());
       employee.setDateOfJoining(employee.getDateOfJoining());
       employee.setEmployeeSalary(employeeDto.getEmployeeSalary());
       employee.setEmployeeMobileNumber(employeeDto.getEmployeeMobileNumber());
       employee.setActive(true);
       employee.setCreatedBy(employeeDto.getCreatedBy());
       employee.setCreatedDate(LocalDateTime.now());
       employee.setUpdatedBy(employeeDto.getUpdatedBy());
       employee.setUpdatedDate(LocalDateTime.now());

        return employeeRepository.save(employee);
    }
}
