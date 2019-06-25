package com.neeraj.testserviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TestServiceRibbonApplication {

	@RequestMapping("/instance/*")
    public String respond()
    {
      
      return "Hello World !! from service at 9002";
    }



	public static void main(String[] args) {
		SpringApplication.run(TestServiceRibbonApplication.class, args);
	}

}
