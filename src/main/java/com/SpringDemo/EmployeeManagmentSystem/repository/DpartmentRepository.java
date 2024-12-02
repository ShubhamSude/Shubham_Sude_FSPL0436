package com.SpringDemo.EmployeeManagmentSystem.repository;

import com.SpringDemo.EmployeeManagmentSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DpartmentRepository extends JpaRepository<Department,Long> {
}
