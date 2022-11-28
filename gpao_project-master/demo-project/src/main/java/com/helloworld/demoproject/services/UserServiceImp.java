package com.helloworld.demoproject.services;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.helloworld.demoproject.models.Role;
import com.helloworld.demoproject.models.User;
import com.helloworld.demoproject.repository.RoleRepository;
import com.helloworld.demoproject.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	BCryptPasswordEncoder encoder;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		user.setStatus("VERIFIED");
		Role userRole = roleRepository.findByRole("SITE_USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}

	@Override
	public boolean isUserAlreadyPresent(User user) {
		// Try to implement this method, as assignment.
		return false;
	}

}