package com.example.demomapstruct.dto;

import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.entity.Student;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentAddressDTO extends AbstractDTO {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long addressId;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long studentId;

    private AddressDTO address;
}
