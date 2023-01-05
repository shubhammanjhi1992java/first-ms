package com.first.firstms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FirstMsApplication {
	
	@Bean
	RestTemplate getRestTemplet() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstMsApplication.class, args);
	}

}
