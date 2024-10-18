package jinuk.project5.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByUsername(String username);

}

/////////////////////////////
package jinuk.project4.member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}



///////////////////////////////
public interface MemberRepository extends JpaRepository<Member, Long> {

  Optional<Member> findByUsername(String username);
  
}


/////////////////////////
package com.apple.shop.member;

import com.apple.shop.member.Member;
import org.springframework.data.jpa.repository.JpaReository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

  Optional<Member> findByUsername(String username);
  
}
