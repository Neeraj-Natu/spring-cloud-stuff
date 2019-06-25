package com.neeraj.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TestServiceRibbon2Application {

	@RequestMapping("/instance/*")
    public String respond()
    {
      
      return "Hello World !! from service at 9001";
    }



	public static void main(String[] args) {
		SpringApplication.run(TestServiceRibbon2Application.class, args);
	}

}
