package com.ugurcangursen.issuemanagement.service;



import com.ugurcangursen.issuemanagement.entity.Issue;
import org.springframework.data.domain.Pageable;

import com.ugurcangursen.issuemanagement.dto.IssueHistoryDto;
import com.ugurcangursen.issuemanagement.util.TPage;

import java.util.List;

public interface IssueHistoryService {

	IssueHistoryDto save(IssueHistoryDto issueHistory);

	IssueHistoryDto getById(Long id);

	List<IssueHistoryDto> getByIssueId(Long id);

	TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

	Boolean delete(IssueHistoryDto issueHistory);

	void addHistory(Long id, Issue issue);
}