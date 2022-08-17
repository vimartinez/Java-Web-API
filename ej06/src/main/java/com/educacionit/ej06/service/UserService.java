package com.educacionit.ej06.service;

import java.util.List;

import com.educacionit.ej06.dao.UserDAO;
import com.educacionit.ej06.model.User;

public class UserService {
	
	UserDAO userDao = new UserDAO();
	public User getUserById(Long id) {	
		return userDao.getById(id);
	}

	public List<User> getAllUsers() {
		return userDao.getAll();
	}

	public Boolean addUser(User user) {
		return userDao.add(user);
	}

	public Boolean updUser(User user) {
		return userDao.upd(user);
	}

	public Boolean delUser(User user) {
		return userDao.del(user);
	}

}
