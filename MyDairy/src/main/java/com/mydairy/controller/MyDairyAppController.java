package com.mydairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mydairy.model.User;
import com.mydairy.service.UserService;

@RestController
@Component
public class MyDairyAppController {

	@Autowired
    UserService userService;
    
	
	 @RequestMapping(value = "/user/", method = RequestMethod.POST)
	    public boolean createUser(@RequestBody User user) {
	        System.out.println("Creating User " + user.getUserName());
	 
	        if (userService.isUserExist(user)) {
	            System.out.println("A User with name " + user.getUserName() + " already exist");
	           return false;
	        }
	 
	        return userService.saveUser(user);
	        
	        
	        
	    }
	 
}
