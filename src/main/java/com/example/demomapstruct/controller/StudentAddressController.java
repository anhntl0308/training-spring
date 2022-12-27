package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.StudentAddressDto;
import com.example.demomapstruct.entity.StudentAddress;
import com.example.demomapstruct.service.StudentAddressService;
import com.example.demomapstruct.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student-address")
public class StudentAddressController extends AbstractController<StudentAddress, StudentAddressDto> {

    @Autowired
    public StudentAddressController(StudentAddressService studentAddressService) {
        super(studentAddressService);
    }
}
