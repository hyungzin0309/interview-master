package com.samgeori.domain.Member;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

}
