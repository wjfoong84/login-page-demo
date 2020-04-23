package com.wjfoong84.loginpagedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wjfoong84.loginpagedemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(final String username);
	
}
