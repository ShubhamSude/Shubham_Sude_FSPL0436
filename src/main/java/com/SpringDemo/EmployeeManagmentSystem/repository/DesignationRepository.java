package com.SpringDemo.EmployeeManagmentSystem.repository;

import com.SpringDemo.EmployeeManagmentSystem.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository <Designation,Long> {
}
