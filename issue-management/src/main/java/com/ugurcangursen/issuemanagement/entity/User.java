package com.ugurcangursen.issuemanagement.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "users", indexes = {@Index(name = "idx_username", columnList = "uname")})
public class User extends BaseEntity {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @Column(name = "uname", length = 100, unique = true)
	    private String username;

	    @Column(name = "pwd", length = 200)
	    private String password;

	    @Column(name = "name_surname", length = 200)
	    private String nameSurname;

	    @Column(name = "email", length = 100)
	    private String email;

	    @JoinColumn(name = "assignee_user_id")
	    @OneToMany(fetch = FetchType.LAZY)
	    private List<Issue> issues;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getNameSurname() {
			return nameSurname;
		}

		public void setNameSurname(String nameSurname) {
			this.nameSurname = nameSurname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public List<Issue> getIssues() {
			return issues;
		}

		public void setIssues(List<Issue> issues) {
			this.issues = issues;
		}

		public User(Long id, String username, String password, String nameSurname, String email, List<Issue> issues) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.nameSurname = nameSurname;
			this.email = email;
			this.issues = issues;
		}

		public User() {
			
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", nameSurname="
					+ nameSurname + ", email=" + email + ", issues=" + issues + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((issues == null) ? 0 : issues.hashCode());
			result = prime * result + ((nameSurname == null) ? 0 : nameSurname.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((username == null) ? 0 : username.hashCode());
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
			User other = (User) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (issues == null) {
				if (other.issues != null)
					return false;
			} else if (!issues.equals(other.issues))
				return false;
			if (nameSurname == null) {
				if (other.nameSurname != null)
					return false;
			} else if (!nameSurname.equals(other.nameSurname))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (username == null) {
				if (other.username != null)
					return false;
			} else if (!username.equals(other.username))
				return false;
			return true;
		}
	    
	    
	
	
	
	
}
