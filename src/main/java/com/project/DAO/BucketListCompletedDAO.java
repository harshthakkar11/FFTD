package com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.VO.BucketListCompletedVO;

public interface BucketListCompletedDAO extends JpaRepository<BucketListCompletedVO, Integer>{

	@Query("select b from BucketListCompletedVO b where b.bucketListVO.bucketListId=? and b.bucketListVO.currentUser.loginId=?")
	public List<BucketListCompletedVO> searchForBucketCompletedList(Integer id, Integer loginId);
	
}
