package com.ugurcangursen.issuemanagement.service;


import java.util.List;




import org.springframework.data.domain.Pageable;
import com.ugurcangursen.issuemanagement.dto.ProjectDto;
import com.ugurcangursen.issuemanagement.util.TPage;

public interface ProjectService {
	
	ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto project);
    
    ProjectDto update(Long id, ProjectDto project);

}
