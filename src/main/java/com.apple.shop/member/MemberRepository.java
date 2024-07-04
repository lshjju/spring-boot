package com.apple.shop.member;

import org.springframework.data.jpa.repository.JpaReository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
