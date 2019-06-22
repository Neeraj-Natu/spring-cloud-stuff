package com.neeraj.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class TestServiceApplication {

  @Value("${eureka.client.service-url.defaultZone}")
  public String defaultZone;


	@RequestMapping("/instance/*")
    public String respond()
    {
      
      return "Hello World !! from zone :" + defaultZone;
    }


	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
	}

}
