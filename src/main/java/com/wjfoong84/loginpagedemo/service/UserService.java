package com.wjfoong84.loginpagedemo.service;

import com.wjfoong84.loginpagedemo.model.User;

public interface UserService {

	User findByUsername(String username);
	
}
