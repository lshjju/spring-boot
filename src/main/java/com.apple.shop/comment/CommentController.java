@Controller
@RequiredArgsConstructor
public class CommentController {

  private final CommentRepository commentRepository;

  @PostMapping("/comment")
  String postComment(
    @RequestParam String content, 
    @RequestParam Long parent, 
    Authentication auth
  ){
    CustomUser user = (CustomUser) auth.getPrincipal();
    
    var data = new Comment();
    data.setContent(content);
    data.setUsername(user.getUsername());
    data.setParentId(parent);
    commentRepository.save(data);
    return "redirect:/list";
  }
}
///////////////////////





