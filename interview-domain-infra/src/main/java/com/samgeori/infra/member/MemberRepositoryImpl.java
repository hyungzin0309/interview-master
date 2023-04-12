package com.samgeori.infra.member;

import com.samgeori.domain.Member.Member;
import com.samgeori.domain.Member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {

    @PersistenceContext
    private final EntityManager em;

    @Override
    public void insert(Member member) {
        em.persist(member);
    }
}
