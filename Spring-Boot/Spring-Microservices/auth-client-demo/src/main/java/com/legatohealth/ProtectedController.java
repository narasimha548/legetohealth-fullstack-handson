package com.legatohealth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("protected-app")
public class ProtectedController {
	
	@GetMapping("/fecth")
	public String getApi() {
		return "GET API";
	}
	
	@PostMapping("/store")
	public String postApi() {
		return "POST API";
	}

}
