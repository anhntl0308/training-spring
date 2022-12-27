package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Student;
import com.example.demomapstruct.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api/student"))
public class StudentController extends AbstractController<Student, StudentDTO> {
    @Autowired
    public StudentController(StudentService studentService) {
        super(studentService);
    }
}
