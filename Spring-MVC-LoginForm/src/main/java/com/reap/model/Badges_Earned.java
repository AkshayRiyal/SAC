
package com.reap.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name = "badgesEarned")
public class Badges_Earned {
	@Id
	@GeneratedValue
	private Integer badgesEarnedId;

	@OneToOne
	private Employee employee;
	@ManyToMany
	private Set<Badges> badges;

	 @ElementCollection(targetClass=Integer.class)
		private List<Integer> value;

	public Integer getBadgesEarnedId() {
		return badgesEarnedId;
	}

	public void setBadgesEarnedId(Integer badgesEarnedId) {
		this.badgesEarnedId = badgesEarnedId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Set<Badges> getBadges() {
		return badges;
	}

	public void setBadges(Set<Badges> badges) {
		this.badges = badges;
	}

	public List<Integer> getValue() {
		return value;
	}

	public void setValue(List<Integer> value) {
		this.value = value;
	}
	 
	

	
}
