package com.project.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bucket_list_tbl")
public class BucketListVO {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bucketListId;
	
	@Column
	private String bucketList;
	
	@Column
	private String status;
	
	@ManyToOne
	private LoginVO currentUser;

	public int getBucketListId() {
		return bucketListId;
	}

	public void setBucketListId(int bucketListId) {
		this.bucketListId = bucketListId;
	}

	public String getBucketList() {
		return bucketList;
	}

	public void setBucketList(String bucketList) {
		this.bucketList = bucketList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LoginVO getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(LoginVO currentUser) {
		this.currentUser = currentUser;
	}
	
}
