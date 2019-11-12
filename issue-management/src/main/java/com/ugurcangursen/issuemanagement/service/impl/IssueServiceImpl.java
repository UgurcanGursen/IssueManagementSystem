package com.ugurcangursen.issuemanagement.service.impl;


import com.ugurcangursen.issuemanagement.dto.IssueDetailDto;
import com.ugurcangursen.issuemanagement.dto.IssueHistoryDto;
import com.ugurcangursen.issuemanagement.service.IssueHistoryService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ugurcangursen.issuemanagement.dto.IssueDto;
import com.ugurcangursen.issuemanagement.entity.Issue;
import com.ugurcangursen.issuemanagement.repository.IssueRepository;
import com.ugurcangursen.issuemanagement.service.IssueService;
import com.ugurcangursen.issuemanagement.util.TPage;

import java.util.Arrays;
import java.util.List;


@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final IssueHistoryService issueHistoryService;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, IssueHistoryService issueHistoryService, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.issueHistoryService = issueHistoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {
        // Bussiness Logic

        if (issue.getDate() == null) {
            throw new IllegalArgumentException("Issue Date cannot be null");
        }

        Issue issueEntity = modelMapper.map(issue, Issue.class);

        issueEntity = issueRepository.save(issueEntity);

        issue.setId(issueEntity.getId());
        return issue;
    }

    @Override
    public IssueDto getById(Long id) {
        Issue issue = issueRepository.getOne(id);
        return modelMapper.map(issue, IssueDto.class);
    }

    public IssueDetailDto getByIdWithDetails(Long id) {
        Issue issue = issueRepository.getOne(id);
        IssueDetailDto detailDto = modelMapper.map(issue, IssueDetailDto.class);
        List<IssueHistoryDto> issueHistoryDtos = issueHistoryService.getByIssueId(issue.getId());
        detailDto.setIssueHistories(issueHistoryDtos);
        return detailDto;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage<IssueDto> respnose = new TPage<IssueDto>();
        respnose.setStat(data, Arrays.asList(modelMapper.map(data.getContent(), IssueDto[].class)));
        return respnose;
    }

    public List<IssueDto> getAll() {
        List<Issue> data = issueRepository.findAll();
        return Arrays.asList(modelMapper.map(data, IssueDto[].class));
    }

    @Override
    public Boolean delete(Long issueId) {
        issueRepository.deleteById(issueId);
        return true;
    }

    @Override
    public IssueDto update(Long id, IssueDto project) {
        return null;
    }

}