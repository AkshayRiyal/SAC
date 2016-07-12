package com.ttnd.reap.hibernate.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Recognise {
	@Id
	@GeneratedValue
	private Integer recognizeId;
	@OneToOne
	private Employee to;
	@OneToOne
	private Employee from;
	private String reason;
	private String karma;
	@OneToOne
	private Badges badge;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	public Recognise(Employee to, Employee from, String reason, String karma, Badges badge,
			Date date) {
		super();
		
		this.to = to;
		this.from = from;
		this.reason = reason;
		this.karma = karma;
		this.badge = badge;
		this.date = date;
	}
	public Integer getRecognizeId() {
		return recognizeId;
	}
	public void setRecognizeId(Integer recognizeId) {
		this.recognizeId = recognizeId;
	}
	public Employee getTo() {
		return to;
	}
	public void setTo(Employee to) {
		this.to = to;
	}
	public Employee getFrom() {
		return from;
	}
	public void setFrom(Employee from) {
		this.from = from;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getKarma() {
		return karma;
	}
	public void setKarma(String karma) {
		this.karma = karma;
	}
	public Badges getBadge() {
		return badge;
	}
	public void setBadge(Badges badge) {
		this.badge = badge;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
  
	

	
}
