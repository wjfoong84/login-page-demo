package com.wjfoong84.loginpagedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjfoong84.loginpagedemo.model.User;
import com.wjfoong84.loginpagedemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
	
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
