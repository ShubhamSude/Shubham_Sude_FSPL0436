package com.SpringDemo.EmployeeManagmentSystem.service;

import com.SpringDemo.EmployeeManagmentSystem.dto.DesignationDto;
import com.SpringDemo.EmployeeManagmentSystem.entity.Designation;
import com.SpringDemo.EmployeeManagmentSystem.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DesignationService {

    @Autowired
    DesignationRepository designationRepository;

    public Designation addDataDesignation(DesignationDto designationDto) {
        Designation designation=new Designation();
        designation.setDesignationId(0L);
        designation.setDesignationName(designationDto.getDesignationName());

        designation.setActive(true);
        designation.setCreatedBy(designationDto.getCreatedBy());
        designation.setCreatedDate(LocalDateTime.now());
        designation.setUpdatedBy(designationDto.getUpdatedBy());
        designation.setUpdatedDate(LocalDateTime.now());

        return designationRepository.save(designation);
    }

    public List<Designation> getDesignationData() {
         List<Designation>listDesignation=designationRepository.findAll();
        return listDesignation;
    }
}
