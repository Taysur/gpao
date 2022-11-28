package com.helloworld.demoproject.services;
import com.helloworld.demoproject.models.User;

public interface UserService {

	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
}

