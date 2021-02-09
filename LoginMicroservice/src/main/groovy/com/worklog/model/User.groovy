package com.worklog.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
class User {
	@Id
	String userId;
	String uname;
	String upassword;
	public User() {
		super();
	}
	
	public User(String userId, String uname, String upassword) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.upassword = upassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
}
