package com.ugurcangursen.issuemanagement.service;



import javax.validation.Valid;

import org.springframework.data.domain.Pageable;

import com.ugurcangursen.issuemanagement.dto.IssueDto;
import com.ugurcangursen.issuemanagement.dto.ProjectDto;
import com.ugurcangursen.issuemanagement.util.TPage;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto project);

}
