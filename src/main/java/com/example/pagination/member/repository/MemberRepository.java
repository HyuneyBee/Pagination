package com.example.pagination.member.repository;

import com.example.pagination.member.entity.Member;
import com.example.pagination.util.CommonPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Page<Member> findByType(Member.MemberType type, Pageable pageable);
}
