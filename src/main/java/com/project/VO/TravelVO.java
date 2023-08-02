package com.project.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "travel_tbl")
public class TravelVO {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int traveId;
	
	@Column
	private String travelFileName;
	
	@Column
	private String country;
	
	@Column
	private String place;
	
	@Column
	private int year;
	
	@ManyToOne
	private LoginVO currentUser;

	public int getTraveId() {
		return traveId;
	}

	public void setTraveId(int traveId) {
		this.traveId = traveId;
	}

	public String getTravelFileName() {
		return travelFileName;
	}

	public void setTravelFileName(String travelFileName) {
		this.travelFileName = travelFileName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public LoginVO getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(LoginVO currentUser) {
		this.currentUser = currentUser;
	}

}
