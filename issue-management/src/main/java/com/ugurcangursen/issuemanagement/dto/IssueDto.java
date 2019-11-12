package com.ugurcangursen.issuemanagement.dto;

import java.util.Date;



import com.ugurcangursen.issuemanagement.entity.IssueStatus;

import io.swagger.annotations.ApiModelProperty;

public class IssueDto {
	
	@ApiModelProperty(required = true,value = "ID")
	private Long id;
	@ApiModelProperty(required = true,value = "Description")
	private String description;
	@ApiModelProperty(required = true,value = "Details")
	private String details;
	@ApiModelProperty(required = true,value = "Date")
	private Date date;
	@ApiModelProperty(required = true,value = "Issue Status")
	private IssueStatus issStatus;
	@ApiModelProperty(required = true,value = "Assigne")
	private UserDto assignee;
	@ApiModelProperty(required = true,value = "Project")
	private ProjectDto project;
	
	
	
	
	public IssueDto() {
	
	}


	public IssueDto(Long id, String description, String details, Date date, IssueStatus issStatus, UserDto assignee,
			ProjectDto project) {
		super();
		this.id = id;
		this.description = description;
		this.details = details;
		this.date = date;
		this.issStatus = issStatus;
		this.assignee = assignee;
		this.project = project;
	}


	@Override
	public String toString() {
		return "IssueDto [id=" + id + ", description=" + description + ", details=" + details + ", date=" + date
				+ ", issStatus=" + issStatus + ", assignee=" + assignee + ", project=" + project + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assignee == null) ? 0 : assignee.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((issStatus == null) ? 0 : issStatus.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IssueDto other = (IssueDto) obj;
		if (assignee == null) {
			if (other.assignee != null)
				return false;
		} else if (!assignee.equals(other.assignee))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (issStatus != other.issStatus)
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		return true;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public IssueStatus getIssStatus() {
		return issStatus;
	}


	public void setIssStatus(IssueStatus issStatus) {
		this.issStatus = issStatus;
	}


	public UserDto getAssignee() {
		return assignee;
	}


	public void setAssignee(UserDto assignee) {
		this.assignee = assignee;
	}


	public ProjectDto getProject() {
		return project;
	}


	public void setProject(ProjectDto project) {
		this.project = project;
	}
	
	
	
	
	

}
