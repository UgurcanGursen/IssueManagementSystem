package com.ugurcangursen.issuemanagement.service;



import org.springframework.data.domain.Pageable;

import com.ugurcangursen.issuemanagement.dto.IssueHistoryDto;
import com.ugurcangursen.issuemanagement.util.TPage;

import java.util.List;

public interface IssueHistoryService {

	List<IssueHistoryDto> getByIssueId(Long id);
	
	 IssueHistoryDto save(IssueHistoryDto issueHistory);

	    IssueHistoryDto getById(Long id);

	    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

	    Boolean delete(IssueHistoryDto issueHistory);

}
