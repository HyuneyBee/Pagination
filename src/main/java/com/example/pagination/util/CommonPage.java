package com.example.pagination.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.domain.*;

import java.util.List;

@JsonIgnoreProperties(value = {"pageable", "last", "totalPages", "totalElements", "size", "number", "first", "numberOfElements", "sort", "empty"})
public class CommonPage <T> extends PageImpl<T> {
    @JsonCreator
    public CommonPage(List<T> content, Pageable pageable, long total) {
        super(content,pageable.getSort().isSorted() ? pageable : PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("createdAt").descending()), total);
    }

    @JsonCreator
    public CommonPage(List<T> content) {
        super(content);
    }

    public CommonPage(Page<T> page) {
        super(page.getContent(), page.getPageable(), page.getTotalElements());
    }

    @JsonGetter(value = "contents")
    @Override
    public List<T> getContent() {
        return super.getContent();
    }

    @JsonGetter(value = "pageInfo")
    public PageInfo getPageInfo() {
        return new PageInfo(super.getNumber() + 1, super.getSize(), super.getTotalPages(), super.getTotalElements());
    }
}
