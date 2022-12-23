package com.example.demomapstruct.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class BasePage<T> {

    private List<T> content;

    private T model;

    private int size;

    private int number;

    private int totalPages;

    private int totalElements;
}
