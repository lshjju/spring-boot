package jinuk.project3.item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}


//////////////////////////////////////
package jinuk.pj1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}


/////////////////////////////////
public interface ItemRepository extends JpaRepository<Item, Long> {

 Page<Item> findPageBy(Pageable page);
 List<Item> findAllByTitleConatins(String title);

 @Query(value = "select * from item where match(title) against(?1)", nativeQuery = true)
 List<Item> rawQuery1(String text);
 

} 
/////////////////////////////////////

