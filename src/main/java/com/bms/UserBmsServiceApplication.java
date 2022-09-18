package com.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserBmsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserBmsServiceApplication.class, args);
	}

}
