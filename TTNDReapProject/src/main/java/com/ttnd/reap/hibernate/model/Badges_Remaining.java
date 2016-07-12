package com.ttnd.reap.hibernate.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "badgesRemaining")
public class Badges_Remaining {
	@Id
	@GeneratedValue
	private Integer reaminingId;
	@OneToOne
	private Employee eid;
	@ManyToMany
	private Set<Badges> bid;
	

    @ElementCollection(targetClass=Integer.class)
	private List<Integer> value;
	
	public List<Integer> getValue() {
		return value;
	}

	public void setValue(List<Integer> value) {
		this.value = value;
	}



	public Integer getReaminingId() {
		return reaminingId;
	}

	public void setReaminingId(Integer reaminingId) {
		this.reaminingId = reaminingId;
	}

	public Employee getEid() {
		return eid;
	}

	public void setEid(Employee eid) {
		this.eid = eid;
	}

	public Set<Badges> getBid() {
		return bid;
	}

	public void setBid(Set<Badges> bid) {
		this.bid = bid;
	}

}
