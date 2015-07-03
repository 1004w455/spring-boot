package com.wisebirds.sap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisebirds.sap.domain.account.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member> findOneByMemberId(String memberId);
}
