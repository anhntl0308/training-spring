package com.example.demomapstruct.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class AddressDTO extends AbstractDTO{

//    private Long id;

    private String city;

    private String fullAddress;
}
