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

	public void addUser(User user) {
		userDao.add(user);
	}

	public void updUser(User user) {
		userDao.upd(user);
	}

	public void delUser(User user) {
		userDao.del(user);
	}

}
