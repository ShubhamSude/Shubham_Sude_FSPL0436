package com.SpringDemo.EmployeeManagmentSystem.repository;

import com.SpringDemo.EmployeeManagmentSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DpartmentRepository extends JpaRepository<Department,Long> {
}