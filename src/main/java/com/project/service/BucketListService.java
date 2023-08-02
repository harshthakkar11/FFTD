package com.project.service;

import java.util.List;

import com.project.VO.BucketListVO;

public interface BucketListService {

	public void insert(BucketListVO bucketListVO);
	
	public List<BucketListVO> getBucketList(Integer id);
	
	public List<BucketListVO> getBucketListData(Integer id);
	
	public void updateBucketListData(String name, String status, Integer id);
	
}
