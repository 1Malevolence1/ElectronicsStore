package com.example.date_base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DateBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateBaseApplication.class, args);
	}

}
