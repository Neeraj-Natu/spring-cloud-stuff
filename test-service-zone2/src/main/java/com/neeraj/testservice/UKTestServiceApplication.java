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
public class UKTestServiceApplication {

  @Value("${eureka.instance.metadataMap.zone}")
  public String region;


	@RequestMapping("/instance/*")
    public String respond()
    {
      
      return "Hello World !! from region: " + region;
    }


	public static void main(String[] args) {
		SpringApplication.run(UKTestServiceApplication.class, args);
	}

}
