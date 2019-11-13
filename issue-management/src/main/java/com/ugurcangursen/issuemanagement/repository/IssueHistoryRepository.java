package com.ugurcangursen.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ugurcangursen.issuemanagement.entity.IssueHistory;

import java.util.List;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
    List<IssueHistory> getByIssueIdOrderById(Long id);
}