package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.StudentAddressDto;
import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Student;
import com.example.demomapstruct.entity.StudentAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface StudentAddressMapper extends AbstractMapper<StudentAddress, StudentAddressDto> {
    StudentAddressDto toDTO(StudentAddress entity);
    @Mapping(target = "fullName", expression = "java(entity.getFirstName() + \" \" + entity.getLastName())")
    StudentDTO toDTO(Student entity);
    @Mapping(target = "student.firstName", source = "student.fullName", qualifiedByName = "getFirstName")
    @Mapping(target = "student.lastName", source = "student.fullName", qualifiedByName = "getLastName")
    StudentAddress toEntity(StudentAddressDto dto);

    @Named("getFirstName")
    static String getFirstName(String fullName) {
        return fullName.split(" ")[0];
    }

    @Named("getLastName")
    static String getLastName(String fullName) {
        return fullName.split(" ")[0];
    }

}
