package com.legatohealth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class PermissionGranter extends ResourceServerConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().
		antMatchers(HttpMethod.GET,"/protected-app/**").hasAnyRole("ADMIN", "USER")
		.antMatchers(HttpMethod.POST, "/protected-app/**").hasAnyRole("ADMIN","USER");
	}

}
