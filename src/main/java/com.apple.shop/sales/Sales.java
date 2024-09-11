@Entity
@Getter
@Setter
@ToString
public class Sales {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String itemName;
  private Integer price;
  private Integer count;
  @ManyToOne
  @JoinColumn(
    name = "member_id", 
    foreignkey = @ForeignKey(ConstrainMode.NO_CONSTRAINT)
  )
  private Member member;
  
  @CreationTimestamp
  private LocalDateTime created;
}
//////////////////////////////




  @ManyToOne(fetch = FetchType.LAZY)

