package com.pe.springbootactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class MainController {
    @GetMapping("/main")
    public String example() {
    	String learnerMessage = "Use the end points to see the Actuator working : " +
    			"http://localhost:8080/actuator/health , /info ";
    	
        return "Hello - Happy learning Actuator !! " +learnerMessage;
    }
}