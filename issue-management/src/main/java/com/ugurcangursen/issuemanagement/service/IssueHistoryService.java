package com.ugurcangursen.issuemanagement.service;



import org.springframework.data.domain.Pageable;

import com.ugurcangursen.issuemanagement.dto.IssueHistoryDto;
import com.ugurcangursen.issuemanagement.util.TPage;

public interface IssueHistoryService {
	
	 IssueHistoryDto save(IssueHistoryDto issueHistory);

	    IssueHistoryDto getById(Long id);

	    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

	    Boolean delete(IssueHistoryDto issueHistory);

}
