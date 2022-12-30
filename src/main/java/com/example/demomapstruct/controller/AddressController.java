package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.mapper.AddressMapper;
import com.example.demomapstruct.payload.BaseResponse;
import com.example.demomapstruct.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(("/api/address"))
public class AddressController extends AbstractController<Address, AddressDTO>{

    @Autowired
    public AddressController(AddressService addressService) {
        super(addressService);
    }

    @GetMapping("/get/{id}")
    public BaseResponse getOne(@PathVariable Long id) {
        return BaseResponse.builder().data(super.getAbstractService().getOne(id)).code("OK").message("").build();
    }

}
