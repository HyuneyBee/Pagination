package com.example.pagination.member.dto.response;

import com.example.pagination.member.entity.Member;
import com.example.pagination.util.CommonPage;
import com.example.pagination.util.PageInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.PageImpl;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class PageMemberResponse {
    private List<MemberResponse> memberItems;
    private PageInfo pageInfo;

    public PageMemberResponse(List<MemberResponse> memberItems, PageInfo pageInfo) {
        this.memberItems = memberItems;
        this.pageInfo = pageInfo;
    }

    public static PageMemberResponse of(CommonPage<Member> memberPage){
        List<MemberResponse> memberResponse = memberPage.getContent()
            .stream().map(MemberResponse::of).toList();
        PageInfo memberPageInfo = memberPage.getPageInfo();
        return new PageMemberResponse(memberResponse, memberPageInfo);
    }
}
