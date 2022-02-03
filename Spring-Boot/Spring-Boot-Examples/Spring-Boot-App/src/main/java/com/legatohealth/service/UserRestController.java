package com.legatohealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legatohealth.beans.CustomMessage;
import com.legatohealth.beans.User;
import com.legatohealth.exceptions.UserNotFoundEception;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/store", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> storeUser(@RequestBody User user) {
		System.out.println("User obje===> " + user);
		User createdUser = userService.storeUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
	}

	@GetMapping(path="/fetchById/{userId}")
	public ResponseEntity<Object> fetchUserById(@PathVariable("userId") int userId) {
		System.out.println("UserId=== " + userId);
		ResponseEntity<Object> response = null;
		try {
			User user = userService.fetchUserById(userId);
			response = ResponseEntity.status(HttpStatus.OK).body(user);
		} catch (UserNotFoundEception e) {
			CustomMessage custom = new CustomMessage(e.getMessage(), 404);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(custom);
		}
		return response;
	}

	@DeleteMapping(path = "/deleteById/{userId}")
	public ResponseEntity<Object> deleteUserById(@PathVariable("userId") int userId) {
		ResponseEntity<Object> response = null;

		try {
			userService.deleteUser(userId);
			CustomMessage custom = new CustomMessage("User with an id " + userId + " deleted", 200);
			response = ResponseEntity.status(HttpStatus.OK).body(custom);
		} catch (UserNotFoundEception e) {
			CustomMessage custom = new CustomMessage(e.getMessage(), 404);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(custom);
		}
		return response;
	}

	@PutMapping(path="/edit/{userId} /{password}")
	public ResponseEntity<Object> updatePassword(@PathVariable("userId") int userId,
			@PathVariable("password") String password) {
		ResponseEntity<Object> response = null;

		try {
			User user = userService.updatePassword(userId, password);
			response = ResponseEntity.status(HttpStatus.OK).body(user);
		} catch (UserNotFoundEception e) {
			CustomMessage custom = new CustomMessage(e.getMessage(), 404);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(custom);
		}

		return response;
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<Object> fetchAllUsers(){
		List<User> list = userService.fetchAll();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

}
