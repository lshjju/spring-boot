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

  @OneToMany(mappedBy = "member")
  List<Sales> sales = new ArrayList<>();

  
}

///////////////////////////


  @ToString.Exclude
 
  private List<Sales> sales = new ArrayList<>();

  

