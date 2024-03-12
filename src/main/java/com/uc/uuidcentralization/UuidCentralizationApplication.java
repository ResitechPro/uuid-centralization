package com.uc.uuidcentralization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UuidCentralizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UuidCentralizationApplication.class, args);
	}

}
