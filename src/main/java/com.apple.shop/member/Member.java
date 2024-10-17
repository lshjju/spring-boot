package jinuk.project4.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String displayName;
    private String password;
}


/////////////////////////////////
@Entity
@Getter
@Setter  
@ToString
public class Member {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String username;
  private String displayName;
  private String password;
  
  @ToString.Exclude
  @OneToMany(mappedBy = "member")
  private List<Sales> sales = new ArrayList<>();
  
}


  

