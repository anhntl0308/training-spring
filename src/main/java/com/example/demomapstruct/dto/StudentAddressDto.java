package com.example.demomapstruct.dto;

import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentAddressDto extends AbstractDTO {
    private StudentDTO student;
    private AddressDTO address;
}
