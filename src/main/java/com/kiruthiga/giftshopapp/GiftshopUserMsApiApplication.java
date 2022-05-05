package com.kiruthiga.giftshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class GiftshopUserMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiftshopUserMsApiApplication.class, args);
	}

}
