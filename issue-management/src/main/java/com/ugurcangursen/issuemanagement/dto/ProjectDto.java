package com.ugurcangursen.issuemanagement.dto;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Project Data Transfer Object")
public class ProjectDto {
	 @ApiModelProperty(value = "Project ID")
	    private Long id;
	    @NotNull
	    @ApiModelProperty(required = true,value = "Name Of Project")
	    private String projectName;
	    @NotNull
	    @ApiModelProperty(required = true,value = "Code Of Project")
	    private String projectCode;

	    @NotNull
	    @ApiModelProperty(required = true,value = "Project Manager ID")
	    private Long managerId;

	    @ApiModelProperty(required = true,value = "Project Manager Name")
	    private UserDto manager;



		public ProjectDto() {
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectCode() {
			return projectCode;
		}

		public void setProjectCode(String projectCode) {
			this.projectCode = projectCode;
		}

		public Long getManagerId() {
			return managerId;
		}

		public void setManagerId(Long managerId) {
			this.managerId = managerId;
		}

		public UserDto getManager() {
			return manager;
		}

		public void setManager(UserDto manager) {
			this.manager = manager;
		}

		public ProjectDto(Long id, @NotNull String projectName, @NotNull String projectCode, @NotNull Long managerId,
				UserDto manager) {
			super();
			this.id = id;
			this.projectName = projectName;
			this.projectCode = projectCode;
			this.managerId = managerId;
			this.manager = manager;
		}
	    
		
	    

}
