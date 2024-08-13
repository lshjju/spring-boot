@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String hello(){
        return "hello";
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

