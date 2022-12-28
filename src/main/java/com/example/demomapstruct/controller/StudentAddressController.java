package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.StudentAddressDTO;
import com.example.demomapstruct.entity.StudentAddress;
import com.example.demomapstruct.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student-address")
public class StudentAddressController extends AbstractController<StudentAddress, StudentAddressDTO> {

    @Autowired
    public StudentAddressController(StudentAddressService studentAddressService) {
        super(studentAddressService);
    }
}
