package com.samgeori.domain.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository {

    void insert(Member member);

}
