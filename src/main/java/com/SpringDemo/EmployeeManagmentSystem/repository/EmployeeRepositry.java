package com.SpringDemo.EmployeeManagmentSystem.repository;

import com.SpringDemo.EmployeeManagmentSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositry extends JpaRepository<Employee,Long> {
}
