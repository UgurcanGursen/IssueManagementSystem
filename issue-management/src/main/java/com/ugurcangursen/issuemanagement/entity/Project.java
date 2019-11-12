package com.ugurcangursen.issuemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "project" )
public class Project extends BaseEntity {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @Column(name = "project_name",length = 300)
	    private String projectName;

	    @Column(name = "project_code",length = 30)
	    private String projectCode;

	    @JoinColumn(name = "manager_user_id")
	    @ManyToOne(optional = true, fetch = FetchType.LAZY)
	    private User manager;

		public Project(Long id, String projectName, String projectCode, User manager) {
			super();
			this.id = id;
			this.projectName = projectName;
			this.projectCode = projectCode;
			this.manager = manager;
		}

		public Project() {
			
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

		public User getManager() {
			return manager;
		}

		public void setManager(User manager) {
			this.manager = manager;
		}

		@Override
		public String toString() {
			return "Project [id=" + id + ", projectName=" + projectName + ", projectCode=" + projectCode + ", manager="
					+ manager + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((manager == null) ? 0 : manager.hashCode());
			result = prime * result + ((projectCode == null) ? 0 : projectCode.hashCode());
			result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
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
			Project other = (Project) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (manager == null) {
				if (other.manager != null)
					return false;
			} else if (!manager.equals(other.manager))
				return false;
			if (projectCode == null) {
				if (other.projectCode != null)
					return false;
			} else if (!projectCode.equals(other.projectCode))
				return false;
			if (projectName == null) {
				if (other.projectName != null)
					return false;
			} else if (!projectName.equals(other.projectName))
				return false;
			return true;
		}

		
		
	    

}
