package com.example.pagination.util;

import lombok.Getter;

@Getter
public class PageInfo {
    private Integer page;
    private Integer pageSize;
    private Integer totalPages;
    private Long totalElements;

    public PageInfo(Integer page, Integer pageSize, Integer totalPages, Long totalElements) {
        this.page = page;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }
}
