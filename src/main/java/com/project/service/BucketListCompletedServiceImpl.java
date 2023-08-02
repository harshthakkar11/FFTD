package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.BucketListCompletedDAO;
import com.project.VO.BucketListCompletedVO;

@Service
public class BucketListCompletedServiceImpl implements BucketListCompletedService{

	@Autowired
	private BucketListCompletedDAO bucketListCompletedDAO;
	
	public void insert(BucketListCompletedVO bucketListCompletedVO) {
		bucketListCompletedDAO.save(bucketListCompletedVO);
	}

	public List<BucketListCompletedVO> getBucketCompletedList(Integer id, Integer loginId) {
		return bucketListCompletedDAO.searchForBucketCompletedList(id, loginId);
	}

}
