package jinuk.project5.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    String register(){
        return "register.html";
    }

    @PostMapping("/member")
    String addMember(String username, String password, String displayName){

        Member member = new Member();
        member.setUsername(username);
//        var hash = new BCryptPasswordEncoder().encode(password);
        var hash = passwordEncoder.encode(password);
        member.setPassword(hash);
        member.setDisplayName(displayName);
        memberRepository.save(member);
        return "redirect:/list";
    }

    @GetMapping("/login")
    public String login() {
        var result = memberRepository.findByUsername("johndoe");
        System.out.println(result.get().getUsername());
        return "login.html";
    }

    @GetMapping("/my-page")
    public String mypPage(Authentication auth) {
//        CustomUser result = (CustomUser) auth.getPrincipal();
//        System.out.println(result.displayName);
        System.out.println(auth);
//        System.out.println(auth.getAuthorities().contains(new SimpleGrantedAuthority("일반유저")));
//        System.out.println(auth);
//        System.out.println(auth.getName());
//        System.out.println(auth.isAuthenticated());
        return "mypage.html";
    }

//    @GetMapping("/logout")
//    public String logout() {
//        return "logout.html";
//    }


}



//////////////////////////
package jinuk.project4.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    String register(){
        return "register.html";
    }

    @PostMapping("/member")
    String addMember( String username, String password, String displayName) {
        Member member = new Member();
        member.setUsername(username);
        var hash = passwordEncoder.encode(password);
        member.setPassword(hash);
        member.setDisplayName(displayName);
        memberRepository.save(member);

        return "redirect:/list";
    }
}



//////////////////////////////////
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
  String addMember(
      String username,
      String password,
      String displayName
  ) {
    Member member = new Member();
    member.setUsername(username);
    var hash = passwordEncoder.encode(password);
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
  public String myPage(Autentication auth) {
    CustomUser result = (CustomUser) auth.getPrincipal();
    return "mypage.html";
  }

  @GetMapping("/user/1")
  @ResponseBody
  public MemberDto getUser() {
    var a = memberRepository.findById(1L);
    var result = a.get();
    var data = new MemberDto(result.getUsername(), result.getDisplayName());
    return data;
  }
  

}

class MemberDto {
  public String username;
  public String displayName;
  MemberDto(String a, String b) {
    this.username = a;
    this.displayName = b;
  }
}



////////////////////////////////////
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
    // System.out.println(auth.getAuthorities().contains(new SimpleGrantedAuthority("일반유저")));
    Customer result = (Customer) auth.getPrincipal();
    System.out.println(result.displayName);
    return "mypage.html";
  }

  
  @GetMapping("/user/1")
  @ResponseBody
  public MemberDto getUser() {
    var a = memberRepository.findById(1L);
    var result = a.get();
    var data = new MemberDto(result.getUsername(), result.getDisplayName());
    return data;
  }

}

class MemberDto {
  public String username;
  public String displayName;
  MemberDto(String a, String b) {
    this.username = a;
    this.displayName = b;
  }
}
