package com.apple.shop.comment;

import com.apple.shop.member.Member;
import org.springframework.data.jpa.repository.JpaReository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

  Optional<Member> findByUsername(String username);
  
}
