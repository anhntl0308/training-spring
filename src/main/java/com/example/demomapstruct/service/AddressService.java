package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.entity.Address;

public interface AddressService extends AbstractService<Address, AddressDTO> {
    AddressDTO findByCity(String city);
}
