package com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.project.VO.BucketListVO;

public interface BucketListDAO extends JpaRepository<BucketListVO, Integer>{

	@Query("select b from BucketListVO b where b.currentUser.loginId=?")
	public List<BucketListVO> searchForBucketList(Integer id);
	
	@Query("select b from BucketListVO b where b.bucketListId=?")
	public List<BucketListVO> searchForBucketListData(Integer id);
	
	@Modifying
	@Transactional
	@Query("update BucketListVO b set b.bucketList=?, b.status=? where b.bucketListId=?")
	public void updateBucketListData(String name, String status, Integer id);
	
}
