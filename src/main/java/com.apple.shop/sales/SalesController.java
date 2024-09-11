@Controller
@RequiredArgsConstructor
public class SalesController {

  private final SalesRepository salesRepository;
  private final MemberRepository memberRepository;
  
  @PostMapping("/order")
  String postOrder(@RequestParam String title,
                   @RequestParam Integer price,
                   @RequestParam Integer count,
                   Authentication auth) {
    Sales sales = new Sales();
    sales.setCount(count);
    sales.setPrice(price);
    sales.setItemName(title);
    CustomUser user = (CustomUser) auth.getPricipal();
    var member = new Member();
    member.setId(user.id);
    sales.setMember(member);    
    salesRepository.save(sales);
    
    return "list.html";
  }

  @GetMapping("/order/all")
  String getOrderAll(){
    List<Sales> result = salesRepository.customFindAll();
    System.out.println(result.get(0));

    memberRepository.finlById(1L);
    System.out.println(result); 
    return "sales.html";
  }
  
}
///////////////////////

  

    
    System.out.println(result.get().getSales());    
    



