package com.apple.shop.member;

import org.springframework.stereotype.Controller;


@Controller
public class MemberController {
  
  @GetMapping("/register")
  String register() {
    return "register.html";
  }

@PostMapping("/member")
String addMember() {
  유저가보낸 아이디비번이름 디비에 저장~~
  return "redirect:/list";
} 

  
} 
