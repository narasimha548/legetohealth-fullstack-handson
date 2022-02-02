package com.legatohealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.Dao.UserDao;
import com.legatohealth.beans.User;

@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	private UserDao dao;

	@Override
	public void store(User user) {
		dao.store(user);
	}

	@Override
	public User fetchUser(int userId) {
		
		return dao.fetchUser(userId);
	}

	@Override
	public List<User> fetchUsers() {
		return dao.fetchUsers();
	}

	@Override
	public void deleteUser(int userId) {
	dao.deleteUser(userId);
		
	}

	@Override
	public void updateUser(int userId, User user) {
		dao.updateUser(userId, user);
	}

}
