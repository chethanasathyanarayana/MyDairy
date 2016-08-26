package com.mydairy.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mydairy.dao.UserDao;
import com.mydairy.model.User;
import com.mydairy.utility.DBUtility;

@Service
@Component
public class UserService {
	
	private final UserDao dao;

	
	private final DBUtility dbUtility;
	
	@Autowired
	public UserService(UserDao userDao,DBUtility dbUtility){
		this.dao=userDao;
		this.dbUtility=dbUtility;
	}

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
