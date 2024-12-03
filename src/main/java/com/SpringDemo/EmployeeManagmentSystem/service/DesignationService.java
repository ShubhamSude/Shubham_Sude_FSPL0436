package com.SpringDemo.EmployeeManagmentSystem.service;

import com.SpringDemo.EmployeeManagmentSystem.entity.Designation;
import com.SpringDemo.EmployeeManagmentSystem.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

@Service
public class DesignationService {

    @Autowired
    DesignationRepository designationRepository;

    public Designation addDesignation() {
        Designation designation=new Designation();
        designation.setDesignationId(0L);
        designation.setDesignationName(designation.getDesignationName());

        return designationRepository.save(designation);
    }
}
