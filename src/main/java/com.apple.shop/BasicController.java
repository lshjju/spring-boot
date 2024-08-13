@Controller
public class BasicController {
    @GetMapping("/")
    String hello(){
        return "index.html";
    }   

    @GetMapping("/about")
    String about(){
        return "피싱사이트예요";
    }   
}

///////////////////////////
package com.apple.shop;

@Controller
public class BasicController {
    
    @GetMapping("/")
    String hello(){
      return "index.html";
    }
} 

