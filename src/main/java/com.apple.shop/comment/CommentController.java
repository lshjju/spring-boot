package com.apple.shop.comment;

import lombok.RequredArgsConstrutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class CommentController {

  private final CommentRepository commentRepository;

  @PostMapping("/comment")
String postComment(@RequestParam String content, Authentication auth) {
  (CustomUser) auth.getPrincipal();
  var data = new Comment();
  data.setContent(content);
  commentRepository.save(data);
  return "redirect:/list";
}



  
}


