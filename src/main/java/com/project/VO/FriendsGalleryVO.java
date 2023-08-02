package com.project.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "friends_gallery_tbl")
public class FriendsGalleryVO {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int friendsGalleryId;

	@Column
	private String fileName;
	
	@ManyToOne
	private LoginVO user;
	
	@ManyToOne
	private LoginVO friend;

	public int getFriendsGalleryId() {
		return friendsGalleryId;
	}

	public void setFriendsGalleryId(int friendsGalleryId) {
		this.friendsGalleryId = friendsGalleryId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public LoginVO getUser() {
		return user;
	}

	public void setUser(LoginVO user) {
		this.user = user;
	}

	public LoginVO getFriend() {
		return friend;
	}

	public void setFriend(LoginVO friend) {
		this.friend = friend;
	}
	
}
