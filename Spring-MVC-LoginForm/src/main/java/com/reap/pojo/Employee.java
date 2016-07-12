package com.reap.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name="employee")
public class Employee {
	@Id
	@GeneratedValue
	private Integer eid;
	private String first_name;
	private String last_name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(unique=true)
	private String email;
	private String password;
	private String gender;
	@OneToOne
	private Services serviceName;
	@OneToOne
	private Practice practiceName;
	private String role;
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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
	public Services getServiceName() {
		return serviceName;
	}
	public void setServiceName(Services serviceName) {
		this.serviceName = serviceName;
	}
	public Practice getPracticeName() {
		return practiceName;
	}
	public void setPracticeName(Practice practiceName) {
		this.practiceName = practiceName;
	}
	public Employee(String first_name, String last_name, Date dob, String email, String password, String gender,
			Services serviceName, Practice practiceName, String role) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.serviceName = serviceName;
		this.practiceName = practiceName;
		this.role=role;
	}
	
	
}
