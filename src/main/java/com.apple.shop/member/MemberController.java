package com.apple.shop.member;

import org.springframework.stereotype.Controller;


@Controller
public class MemberController {
  @GetMapping("/register")
  public String register() {
    return "register.html";
  }
} 
