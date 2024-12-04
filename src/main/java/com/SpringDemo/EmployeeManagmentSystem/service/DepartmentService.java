package com.SpringDemo.EmployeeManagmentSystem.service;

import com.SpringDemo.EmployeeManagmentSystem.dto.DepartmentDto;
import com.SpringDemo.EmployeeManagmentSystem.entity.Department;
import com.SpringDemo.EmployeeManagmentSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department addDepartmentData(DepartmentDto departmentDto) {
        Department department=new Department();
        department.setDepartmentId(0L);
        department.setDepartmentName(departmentDto.getDepartmentName());
        department.setActive(true);
        department.setCreatedBy(departmentDto.getCreatedBy());
        department.setCreatedDate(LocalDateTime.now());
        department.setUpdatedBy(departmentDto.getUpdatedBy());
        department.setUpdatedDate(LocalDateTime.now());
        return departmentRepository.save(department);
    }


    public List<Department> getDepartmentData() {
        List<Department> listDepartment=departmentRepository.findAll();
        return listDepartment;
    }
}
