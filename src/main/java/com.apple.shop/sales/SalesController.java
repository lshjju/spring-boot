@Controller
@RequiredArgsConstructor
public class SalesController {

  private final SalesRepository salesRepository;
  
  @PostMapping("/order")
  String postOrder(String title, 
                   Integer price, 
                   Integer count, 
                   Authentication auth) {
  
    Sales sales = new Sales();
    sales.setTitle(title);
    sales.setPrice(price);
    sales.setCount(count);
    sales.setMemberId(???);
    salesRepository.save(sales);
    return "list.html";
  
  }
  
}

