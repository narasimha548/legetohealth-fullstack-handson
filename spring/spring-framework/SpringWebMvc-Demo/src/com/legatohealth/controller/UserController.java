package com.legatohealth.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.legatohealth.beans.User;
import com.legatohealth.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "datetime", method = RequestMethod.GET)
	public ModelAndView home() {
		LocalDateTime dt = LocalDateTime.now();

		ModelAndView mav = new ModelAndView("welcome", "date", dt);
		return mav;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView storeUser(@RequestParam("n1") String name, @RequestParam("pwd") String password,
			@RequestParam("age") int age) {
		User usr = new User();
		usr.setName(name);
		usr.setPassword(password);
		usr.setAge(age);

		System.out.println(" usr :: " + usr);

		userService.store(usr);

		return new ModelAndView("storeSuccess", "msg", "Sucessfully stored");
	}
	
	@RequestMapping(value = "editById/{userId}", method = RequestMethod.GET)
	public ModelAndView editUser(@PathVariable("userId")int userId) {
		User fetchUser = userService.fetchUser(userId);
		System.out.println("user===== "+fetchUser);
		return new ModelAndView("UserEdit", "update", fetchUser);
	}

	@RequestMapping(value = "updateUser", method = RequestMethod.POST)
	public ModelAndView updateUser(@RequestParam("userId") int userId, @RequestParam("n1") String name,
			@RequestParam("pwd") String password, @RequestParam("age") int age) {
		
		User usr = new User();
		usr.setName(name);
		usr.setPassword(password);
		usr.setAge(age);

		System.out.println(" usr :: " + usr);
		userService.updateUser(userId, usr);
		return new ModelAndView("UsersData", "update", "Updated User Data Scccessfully !!");
	}
	
	@RequestMapping(value = "deleteUser/{userId}", method = RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable("userId") int userId) {
		
		userService.deleteUser(userId);
		 return new ModelAndView("storeSuccess", "delete", " User Data Deleted Scccessfully !!");
	}
	
	@RequestMapping(value = "fetchUser", method =RequestMethod.GET )
	public ModelAndView fetchById(@RequestParam("id")int userId) {
		User fetchUser = userService.fetchUser(userId);
		return new ModelAndView("storeSuccess", "fetch", fetchUser);
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ModelAndView fetchAllUsers() {
		
		List<User> fetchUsers = userService.fetchUsers();
		System.out.println("users are :: "+fetchUsers);
		return new ModelAndView("UsersData", "list", fetchUsers);
	}

}
