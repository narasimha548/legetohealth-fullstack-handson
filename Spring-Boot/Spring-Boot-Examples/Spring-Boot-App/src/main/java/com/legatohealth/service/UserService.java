package com.legatohealth.service;

import java.util.List;

import com.legatohealth.beans.User;
import com.legatohealth.exceptions.UserNotFoundEception;

public interface UserService {
	
	public User storeUser(User user);
	public User fetchUserById(int userId) throws UserNotFoundEception;
	public void deleteUser(int userId) throws UserNotFoundEception;
	public User updatePassword(int userId,String password) throws UserNotFoundEception;
	public List<User> fetchAll();
	

}
