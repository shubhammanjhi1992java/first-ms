package com.first.firstms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FirstController {
	
	@Autowired
	private RestTemplate restTemplete;
	
	
	
	@GetMapping("/hit-ms")
	public String hitms() {
		String url="http://localhost:8080/exception";
		
		ResponseEntity<String>  res=restTemplete.exchange(url, HttpMethod.GET, null, String.class);
		return res.getBody();
	}

}
