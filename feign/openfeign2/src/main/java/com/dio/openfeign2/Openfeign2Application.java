package com.dio.openfeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Openfeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Openfeign2Application.class, args);
	}

}
