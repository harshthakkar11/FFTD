package com.project.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event_tbl")
public class EventVO {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eventId;

	@Column
	private String eventFileName;
	
	@Column
	private String eventName;
	
	@Column
	private int year;
	
	@ManyToOne
	private LoginVO currentUser;

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventFileName() {
		return eventFileName;
	}

	public void setEventFileName(String eventFileName) {
		this.eventFileName = eventFileName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LoginVO getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(LoginVO currentUser) {
		this.currentUser = currentUser;
	}

}
