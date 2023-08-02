package com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.VO.FriendsGalleryVO;

public interface FriendsGalleryDAO extends JpaRepository<FriendsGalleryVO, Integer>{

	@Query("select f from FriendsGalleryVO f where f.user.username=? and f.friend.username=?")
	List<FriendsGalleryVO> searchForFriendsGalleryList(String userName, String friendName);
	
}
