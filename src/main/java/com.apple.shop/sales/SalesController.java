@Controller
@RequiredArgsConstructor
public class SalesController {

  private final SalesRepository salesRepository;
  
  @PostMapping("/order")
  String postOrder(@RequestParam String title, 
                   @RequestParam Integer price, 
                   @RequestParam Integer count, 
                   Authentication auth) {
    Sales sales = new Sales();
    sales.setCount(count);
    sales.setPrice(price);
    sales.setItemName(title);
    CustomUser user = (Customuser) auth.getPrincipal();
    sales.setMemberId(???);
    salesRepository.save(sales);
    return "list.html";
  
  }
  
}

