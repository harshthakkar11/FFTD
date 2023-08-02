package com.project.VO;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "justHappened_tbl")
public class JustHappenedVO {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int justHappenedId;
	
	@Column
	private String justHappenedFileName;
	
	@Column
	private String eventName;
	
	@Column
	private int year;
	
	@Column
    private String date;
	
	@Column
	private int expDays;
	
	@Column
	private String comment;

	@ManyToOne
	private LoginVO currentUser;
	
	public int getJustHappenedId() {
		return justHappenedId;
	}

	public void setJustHappenedId(int justHappenedId) {
		this.justHappenedId = justHappenedId;
	}

	public String getJustHappenedFileName() {
		return justHappenedFileName;
	}

	public void setJustHappenedFileName(String justHappenedFileName) {
		this.justHappenedFileName = justHappenedFileName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getExpDays() {
		return expDays;
	}

	public void setExpDays(int expDays) {
		this.expDays = expDays;
	}

	public LoginVO getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(LoginVO currentUser) {
		this.currentUser = currentUser;
	}
	
}
