package com.example.demomapstruct.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AbstractDTO {

    public Long id;

    private Date createdDate;

    private Date updatedDate;
}
