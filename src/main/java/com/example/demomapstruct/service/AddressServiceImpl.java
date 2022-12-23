package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.mapper.AddressMapper;
import com.example.demomapstruct.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends AbstractServiceImpl<Address, AddressDTO> implements AddressService{

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper) {
        super(addressRepository, addressMapper);
    }

    @Override
    public AddressDTO findByCity(String city) {
        return null;
    }
}
