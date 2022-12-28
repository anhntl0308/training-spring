package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.StudentAddressDTO;
import com.example.demomapstruct.entity.StudentAddress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentAddressMapper extends AbstractMapper<StudentAddress, StudentAddressDTO> {
//    StudentAddressDto toDTO(StudentAddress entity);
//    @Mapping(target = "fullName", expression = "java(entity.getFirstName() + \" \" + entity.getLastName())")
//    StudentDTO toDTO(Student entity);
//    @Mapping(target = "student.firstName", source = "student.fullName", qualifiedByName = "getFirstName")
//    @Mapping(target = "student.lastName", source = "student.fullName", qualifiedByName = "getLastName")
//    StudentAddress toEntity(StudentAddressDto dto);
//
//    @Named("getFirstName")
//    static String getFirstName(String fullName) {
//        return fullName.split(" ")[0];
//    }
//
//    @Named("getLastName")
//    static String getLastName(String fullName) {
//        return fullName.split(" ")[0];
//    }

}
