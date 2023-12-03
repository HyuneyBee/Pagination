package com.example.pagination.member.service;

import com.example.pagination.member.dto.request.ReadMemberParams;
import com.example.pagination.member.entity.Member;
import com.example.pagination.member.repository.MemberRepository;
import com.example.pagination.util.CommonPage;
import com.example.pagination.util.CommonPageable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public CommonPage<Member> getMember(ReadMemberParams params, Pageable pageable){
        return new CommonPage<>(memberRepository.findByType(params.getType(), pageable));
    }
}
