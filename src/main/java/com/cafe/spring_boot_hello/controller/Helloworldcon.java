package com.cafe.spring_boot_hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Helloworldcon {
	@RequestMapping("/hello")    
    public String index() { 
        return "Hello World";
    }

}
