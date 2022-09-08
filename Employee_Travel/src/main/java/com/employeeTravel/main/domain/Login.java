package com.employeeTravel.main.domain;

import java.util.Objects;

public class Login {
	private String userId;
	private String password;
	private String designation;

	public Login() {

	}

	public Login(String userId, String password, String designation) {
		super();
		this.userId = userId;
		this.password = password;
		this.designation = designation;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, password, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(password, other.password)
				&& Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + ", designation=" + designation + "]";
	}

}
