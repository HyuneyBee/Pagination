package com.example.pagination.member.dto.request;

import com.example.pagination.member.entity.Member;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReadMemberParams {
    private String name;
    private Member.MemberType type;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createdDate;
}
