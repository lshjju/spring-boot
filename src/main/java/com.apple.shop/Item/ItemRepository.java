public interface ItemRepository extends JpaRepository<Item, Long> {

 Page<Item> findPageBy(Pageable page);
 List<Item> findAllByTitleConatins(String title);

 @Query(value = "select * from item where id = 2", nativeQuery = true)
 Item rawQuery1();
 

} 
/////////////////////////////////////






  @Query(value = "select * from item where match(title) against(?1)", nativeQuery = true)
  List<Item> rawQuery1(String text);


