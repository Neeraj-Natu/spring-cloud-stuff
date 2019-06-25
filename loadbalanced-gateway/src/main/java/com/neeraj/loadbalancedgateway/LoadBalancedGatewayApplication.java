package com.neeraj.loadbalancedgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class LoadBalancedGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancedGatewayApplication.class, args);
	}

}
