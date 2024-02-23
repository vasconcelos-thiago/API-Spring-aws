package com.example.apispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiSpringApplication {


	public static void main(String[] args) {
		SpringApplication.run(ApiSpringApplication.class, args);

 	}

}
