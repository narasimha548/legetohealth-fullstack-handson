package com.legatohealth.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.beans.User;
import com.legatohealth.dao.UserDao;
import com.legatohealth.exceptions.UserNotFoundEception;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User storeUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User fetchUserById(int userId) throws UserNotFoundEception {

		Optional<User> optional = userDao.findById(userId);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new UserNotFoundEception("User with an id " + userId + " not found ");
		}
	}

	@Override
	@Transactional
	public void deleteUser(int userId) throws UserNotFoundEception {
		User user = fetchUserById(userId);
		userDao.delete(user);
	}

	@Override
	@Transactional
	public User updatePassword(int userId, String password) throws UserNotFoundEception {
		User user = fetchUserById(userId);
		user.setPassword(password);
		return userDao.save(user);
	}

	@Override
	public List<User> fetchAll() {

		return userDao.findAll();
	}

}
