package com.example.demomapstruct.service.impl;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.exception.ResourceNotFoundException;
import com.example.demomapstruct.mapper.AddressMapper;
import com.example.demomapstruct.repository.AddressRepository;
import com.example.demomapstruct.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends AbstractServiceImpl<Address, AddressDTO> implements AddressService {

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper) {
        super(addressRepository, addressMapper);
    }

    @Override
    public AddressDTO findByCity(String city) {
        return null;
    }


    @Override
    public AddressDTO getOne(Long id) {
        return super.getAbstractMapper().toDTO(getAbstractRepository().findById(id).orElseThrow(() -> new ResourceNotFoundException(id)));
    }
}
