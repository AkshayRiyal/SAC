package com.reap.pojo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity(name="services")
public class Services {
	@Id @GeneratedValue
	private Integer serviceId;
	private String serviceName;
	@OneToMany
	private Set<Practice> pratice; 
	
	public Set<Practice> getPratice() {
		return pratice;
	}
	public void setPratice(Set<Practice> pratice) {
		this.pratice = pratice;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
}
