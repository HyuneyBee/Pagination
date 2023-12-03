package com.example.pagination.member.dto.response;

import com.example.pagination.member.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class MemberResponse {
    private Long id;
    private String name;
    private Member.MemberType type;
    private LocalDateTime createdDate;

    public MemberResponse(Long id, String name, Member.MemberType type, LocalDateTime createdDate){
        this.id = id;
        this.name = name;
        this.type = type;
        this.createdDate = createdDate;
    }

    public static MemberResponse of(Member member){
        return new MemberResponse(member.getId(), member.getName(), member.getType(), member.getCreatedDate());
    }
}
