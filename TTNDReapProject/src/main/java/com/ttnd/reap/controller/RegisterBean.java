package com.ttnd.reap.controller;

public class RegisterBean {
	private String firstName;
	private String lastName;
	
	private String dob;
	
	private String email;
	private String password;
	private String gender;
	private String services;
	private String practice;
	private String role;

	public String getFirst_name() {
		return firstName;
	}

	public void setFirst_name(String first_name) {
		this.firstName = first_name;
	}

	public String getLast_name() {
		return lastName;
	}

	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getPractice() {
		return practice;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
