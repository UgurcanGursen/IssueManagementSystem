package com.ugurcangursen.issuemanagement.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "issue_history" )
public class IssueHistory extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JoinColumn(name = "issue_id")
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	private Issue issue;
	
	@Column(name = "description", length = 1000)
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date date;
	
	@Column(name = "issue_status")
	@Enumerated(EnumType.STRING)
	private IssueStatus issueStatus;

	@Column(name = "details", length = 4000)
	private String details;
	
	@JoinColumn(name = "assignee_user_id")
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	private User assignee;

	public IssueHistory() {
		
	}

	public IssueHistory(Long id, Issue issue, String description, Date date, IssueStatus issueStatus, User assignee,String details) {
		super();
		this.id = id;
		this.issue = issue;
		this.description = description;
		this.date = date;
		this.issueStatus = issueStatus;
		this.assignee = assignee;
		this.details = details;
	}

	@Override
	public String toString() {
		return "IssueHistory [id=" + id + ", issue=" + issue + ", description=" + description + ", date=" + date
				+ ", issueStatus=" + issueStatus + ", assignee=" + assignee + ", details=" + details + "]";
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public IssueStatus getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(IssueStatus issueStatus) {
		this.issueStatus = issueStatus;
	}

	public User getAssignee() {
		return assignee;
	}

	public void setAssignee(User assignee) {
		this.assignee = assignee;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof IssueHistory)) return false;
		IssueHistory that = (IssueHistory) o;
		return getId().equals(that.getId()) &&
				getIssue().equals(that.getIssue()) &&
				getDescription().equals(that.getDescription()) &&
				getDate().equals(that.getDate()) &&
				getIssueStatus() == that.getIssueStatus() &&
				getDetails().equals(that.getDetails()) &&
				getAssignee().equals(that.getAssignee());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getIssue(), getDescription(), getDate(), getIssueStatus(), getDetails(), getAssignee());
	}
}
