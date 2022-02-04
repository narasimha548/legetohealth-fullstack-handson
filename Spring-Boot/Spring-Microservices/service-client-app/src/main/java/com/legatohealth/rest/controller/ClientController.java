package com.legatohealth.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.legatohealth.client.Client;

@RestController
@RequestMapping("myclient")
public class ClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Client client;
	
	@GetMapping("one")
	public ResponseEntity<Object> callFirstApp(){
		
		String url = "http://FIRSTAPP/myfirstapp"; // we are using logical name
		String data = restTemplate.getForObject(url, String.class); 
		return ResponseEntity.status(200).body("Second App Calling "+data);
	}

	@GetMapping("test")
	public ResponseEntity<Object>  feignClientTest(){
		String invokeFirstApp = client.invokeFirstApp();
		return ResponseEntity.status(200).body("Called through feign "+invokeFirstApp);
	}
	
}
