package com.example.demomapstruct.service.impl;

import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Student;
import com.example.demomapstruct.exception.ResourceNotFoundException;
import com.example.demomapstruct.mapper.StudentMapper;
import com.example.demomapstruct.repository.StudentRepository;
import com.example.demomapstruct.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends AbstractServiceImpl<Student, StudentDTO> implements StudentService {
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        super(studentRepository, studentMapper);
    }

    @Override
    public StudentDTO getOne(Long id) {
        return super.getAbstractMapper().toDTO(getAbstractRepository().findById(id).orElseThrow(() -> new ResourceNotFoundException(id)));
    }
}
