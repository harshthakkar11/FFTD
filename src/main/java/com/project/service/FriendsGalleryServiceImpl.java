package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.FriendsGalleryDAO;
import com.project.VO.FriendsGalleryVO;

@Service
public class FriendsGalleryServiceImpl implements FriendsGalleryService{

	@Autowired
	FriendsGalleryDAO friendsGalleryDao;
	
	public void insert(FriendsGalleryVO friendsGalleryVO) {
		friendsGalleryDao.save(friendsGalleryVO);
	}

	public List<FriendsGalleryVO> getFriendsGalleryList(String userName, String friendName) {
		return friendsGalleryDao.searchForFriendsGalleryList(userName, friendName);
	}

	public void deletePost(Integer id) {
		friendsGalleryDao.delete(id);
	}

}
