package com.project.service;

import java.util.List;

import com.project.VO.FriendsGalleryVO;

public interface FriendsGalleryService {

	public void insert(FriendsGalleryVO friendsGalleryVO);
	
	public List<FriendsGalleryVO> getFriendsGalleryList(String userName, String friendName);
	
	public void deletePost(Integer id);
	
}
