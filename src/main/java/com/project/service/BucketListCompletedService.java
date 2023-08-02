package com.project.service;

import java.util.List;

import com.project.VO.BucketListCompletedVO;

public interface BucketListCompletedService {

	public void insert(BucketListCompletedVO bucketListCompletedVO);
	
	public List<BucketListCompletedVO> getBucketCompletedList(Integer id, Integer loginId);
}
