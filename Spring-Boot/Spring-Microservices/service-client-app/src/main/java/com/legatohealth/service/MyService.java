package com.legatohealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.client.Client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class MyService {
	
	
	@Autowired
	private Client client;
	
	@CircuitBreaker(name="fetchFirstApp", fallbackMethod ="firstAppCallBackData")
	public String getFirstAppData() {
		String data = client.invokeFirstApp();
		return data;
	}
	
	
	public String firstAppCallBackData(Throwable t) {
		
		System.out.println("Request is not going to firstapp---");
		System.err.println("---"+t+"-----");
		return "Alternative Response from fallback";
	}

}
