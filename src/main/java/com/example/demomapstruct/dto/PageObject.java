package com.example.demomapstruct.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class PageObject<T> {

    private List<T> content;

    private int pageSize;

    private int pageNumber;

    private int totalPages;

    private int totalElements;

    public PageObject(List<T> content, int pageSize, int pageNumber, int totalPages, int totalElements) {
        this.content = content;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }
}
