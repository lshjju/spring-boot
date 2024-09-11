public interface SalesRepository extends JpaRepository<Sales, Long> {

  @Query(value = "SELECT s FROM Sales s JOIN FETCH s.member")
  List<Sales> customFindAll();
  

}

/////////////////////////


public interface SalesRepository extends JpaRepository<Sales, Long> {

  @Query(value = "SELECT s FROM Sales s JOIN FETCH s.member")
  List<Sales> customFindAll();
  

}
