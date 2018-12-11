package com.cafe.spring_boot_hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
//@EnableAutoConfiguration
//@RestController
@SpringBootApplication
public class App 
{
//	@RequestMapping("/")
//	String index() {
//		return "hello springboot666 ";
//	}
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	SpringApplication.run(App.class, args);
    }
}
