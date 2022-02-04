package com.legatohealth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myfirstapp")
public class FirstController {
	
	@GetMapping
	public ResponseEntity<Object>  greetings(){
		return ResponseEntity.status(HttpStatus.OK).body("First app !!");
	}

}
