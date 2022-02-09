package com.legatohealth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DigitalSignKey {
	
	@Value("${sigining.key}")
	private String key;

	public String getKey() {
		return key;
	}

	
}
