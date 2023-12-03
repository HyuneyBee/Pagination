package com.example.pagination.member.controller;

import com.example.pagination.member.dto.request.ReadMemberParams;
import com.example.pagination.member.dto.response.PageMemberResponse;
import com.example.pagination.member.entity.Member;
import com.example.pagination.member.service.MemberService;
import com.example.pagination.util.CommonPage;
import com.example.pagination.util.CommonPageable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/member")
    public ResponseEntity getMember(ReadMemberParams params, CommonPageable pageable){
        CommonPage<Member> members = memberService.getMember(params, pageable.of());

        return ResponseEntity.ok(PageMemberResponse.of(members));
    }

}
