package com.apple.shop.comment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {


  
  @PostMapping("/comment")
String postComment(@RequestParam String content) {
  var data = new Comment();
  data.setContent(content);
  commentRepository.save(data);
  return "redirect:/list";
}



  
}


