package com.example.demomapstruct.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class StudentDTO extends AbstractDTO{


    private String firstName;

    @Max(value = 10, message = "lastName student  must be not greater than 10" )
    private String lastName;

    @Max(value = 40, message = "student age must be not greater than 40")
    @Min(value= 12, message = "student age must be not less than 12")
    private int age;

    private Set<StudentAddressDTO> addressList = new HashSet<>();
}
