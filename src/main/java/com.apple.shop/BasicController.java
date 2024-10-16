package jinuk.project3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

    @GetMapping("/")
    String hello(){
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about(){
        return "피싱사이트예요";
    }
}



/////////////////////////////
package jinuk.pj1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello() {
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "its a fishing";
    }
}

/////////////////////////////////
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

