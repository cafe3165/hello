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

@SpringBootApplication
public class App 
{

    public static void main( String[] args )
    {
        
    	SpringApplication.run(App.class, args);
    	System.out.println( "Hello World!" );
    }
}
