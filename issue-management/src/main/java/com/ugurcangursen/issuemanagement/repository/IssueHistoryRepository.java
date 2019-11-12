package com.ugurcangursen.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ugurcangursen.issuemanagement.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

}
