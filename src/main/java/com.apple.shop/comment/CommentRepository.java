public interface CommentRepository extends JpaRepository<Comment, Long> {

  List<Comment> findAllByParentId(Long parentId);
  
}

///////////////////////////

