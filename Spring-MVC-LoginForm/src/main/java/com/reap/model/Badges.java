
package com.reap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "badges")
public class Badges {
	@Id
	@GeneratedValue
	private Integer badgeId;
	private String badgeName;
	private Integer badgeWeight;

	public Integer getBadgeId() {
		return badgeId;
	}

	public void setBadgeId(Integer badgeId) {
		this.badgeId = badgeId;
	}

	public String getBadgeName() {
		return badgeName;
	}

	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName;
	}

	public Integer getBadgeWeight() {
		return badgeWeight;
	}

	public void setBadgeWeight(Integer badgeWeight) {
		this.badgeWeight = badgeWeight;
	}

}
