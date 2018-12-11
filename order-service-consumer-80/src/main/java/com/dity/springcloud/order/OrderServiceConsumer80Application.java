package com.dity.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceConsumer80Application {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceConsumer80Application.class, args);
	}
}
