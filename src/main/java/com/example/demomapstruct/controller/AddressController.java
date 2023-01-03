package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.mapper.AddressMapper;
import com.example.demomapstruct.payload.BaseResponse;
import com.example.demomapstruct.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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

    public ResponseEntity<AddressDTO> create(@RequestBody @Valid AddressDTO dto, HttpServletRequest request){
//        if(request.getHeader("group")!=null){
//            dto.setCity("city");
//            return ResponseEntity.ok(super.getAbstractService().create(dto));
//        } else {
//            return ResponseEntity.ok(super.getAbstractService().create(dto));
//        }
        String city = request.getHeader("city").toString();
        if(city!= null){
            dto.setCity(city);
        }
        return super.create(dto);
    }

}
