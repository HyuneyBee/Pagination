package com.example.pagination.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column
    private MemberType type;

    @Column
    @CreatedDate
    private LocalDateTime createdDate;

    public enum MemberType{
        NORMAL, SUPER, ADMIN
    }
}
