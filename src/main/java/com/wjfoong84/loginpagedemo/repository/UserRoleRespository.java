package com.wjfoong84.loginpagedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wjfoong84.loginpagedemo.model.Role;

public interface UserRoleRespository extends JpaRepository<Role, Long> {

}
