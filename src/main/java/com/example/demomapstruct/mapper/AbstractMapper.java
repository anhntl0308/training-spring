package com.example.demomapstruct.mapper;

import java.util.List;

public interface AbstractMapper<T, Y> {

    T toEntity(Y dto);

    Y toDTO(T entity);

    List<Y> toListDTO(List<T> list);
}
