package com.dity.springcloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceProvider8002Application {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceProvider8002Application.class, args);
	}
}
