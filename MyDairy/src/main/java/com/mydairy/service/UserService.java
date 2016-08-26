package com.mydairy.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.mydairy.dao.UserDao;
import com.mydairy.model.User;
import com.mydairy.utility.DBUtility;

public class UserService {
	@Autowired
	UserDao dao;

	@Autowired
	DBUtility dbUtility;

	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		Connection connection = dbUtility.getConnection();
		try {
			java.sql.Statement statement = connection.createStatement();
			boolean result = statement.execute("select * from userdetails");
			return result;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
