package com.mydairy.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mydairy.dao.UserDao;
import com.mydairy.model.User;

public class UserService {
	@Autowired
	UserDao dao;

	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

}
