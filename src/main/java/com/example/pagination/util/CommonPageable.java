package com.example.pagination.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class CommonPageable {

    private int page = 1;
    private int pageSize = 10;

    public void setPage(int page) {
        this.page = page <= 0 ? 1 : page;
    }

    public void setSize(int pageSize) {
        int DEFAULT_SIZE = 10;
        int MAX_SIZE = 50;
        this.pageSize = pageSize > MAX_SIZE ? DEFAULT_SIZE : pageSize;
    }

    public Pageable of() {
        return PageRequest.of(page - 1, pageSize);
    }
}
