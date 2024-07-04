package com.apple.shop.member;

import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MemberController {
  private final MemberRepository memberRepository;

  @PostMapping("/member")
  public String addMember(
          String username,
          String password,
          String displayName
  ) {
    Member member = new Member();
    member.setUsername(username);
    var hash = new BCryptPasswordEncoder().encode(password);
    member.setPassword(hash);
    member.setDisplayName(displayName);
    memberRepository.save(member);

    return "redirect:/list";
  }
}
