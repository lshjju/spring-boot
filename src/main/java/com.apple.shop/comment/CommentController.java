@Controller
@RequiredArgsConstructor
public class CommentController {

  private final CommentRepository commentRepository;

  @PostMapping("/comment")
  String postComment(@RequestParam String content, Authentication auth){
    (CustomUser) auth.getPrincipal();
    var data = new Comment();
    data.setContent("sdfsdf");
    commentRepository.save(data);
    return "";
  }
}
///////////////////////
package com.apple.shop.comment;

import lombok.RequredArgsConstrutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class CommentController {

private final CommentRepository commentRepository;

@PostMapping("/comment")
String postComment(@RequestParam String content, 
                   @RequestParam Long parent, 
                   Authentication auth
) {
  CustomUser user = (CustomUser) auth.getPrincipal();
  
  var data = new Comment();
  data.setContent(content);
  data.setUsername(user.getUsername());
  data.setParentId(parent);
  commentRepository.save(data);
  return "redirect:/list";
}



  
}


