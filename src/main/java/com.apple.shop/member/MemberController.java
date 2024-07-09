package com.apple.shop.member;

import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MemberController {
  
  private final MemberRepository memberRepository;
  private final PasswordEncoder passwordEncoder;

  @GetMapping("/register")
  String register() {
    return "register.html";
  }

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

  @GetMapping("/login")
  public String login() {
    return "login.html";
  }
  
  @GetMapping("/my-page")
  public String myPage(Authentication auth) {
    // System.out.println(auth);
    // System.out.println(auth.getName());
    // System.out.println(auth.isAuthenticated());
    System.out.println(auth.getAuthorities().contains(
          new SimpleGrantedAuthority("일반유저")
    ));
    return "mypage.html";
  }



  
}
