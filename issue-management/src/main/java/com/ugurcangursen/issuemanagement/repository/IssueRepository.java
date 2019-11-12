package com.ugurcangursen.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ugurcangursen.issuemanagement.entity.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
	
	

}
