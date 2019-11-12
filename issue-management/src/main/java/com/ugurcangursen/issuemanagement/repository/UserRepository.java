package com.ugurcangursen.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ugurcangursen.issuemanagement.entity.Issue;
import com.ugurcangursen.issuemanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
