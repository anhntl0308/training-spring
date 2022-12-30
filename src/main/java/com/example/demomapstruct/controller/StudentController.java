package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Student;
import com.example.demomapstruct.exception.ResourceNotFoundException;
import com.example.demomapstruct.payload.BaseResponse;
import com.example.demomapstruct.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;

@RestController
@RequestMapping(("/api/student"))
public class StudentController extends AbstractController<Student, StudentDTO> {
    @Autowired
    public StudentController(StudentService studentService) {
        super(studentService);
    }

    @GetMapping("/get/{id}")
    public BaseResponse getOne(@PathVariable @Min(1) Long id) {
        return BaseResponse.builder().data(super.getAbstractService().getOne(id)).code("OK").message("").build();
    }
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public BaseResponse studentNotFoundHandler(){
//        return BaseResponse.builder().message("student is not found").code("404").build();
//    }
}
