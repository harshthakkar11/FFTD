package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.BucketListDAO;
import com.project.VO.BucketListVO;

@Service
public class BucketListServiceImpl implements BucketListService{

	@Autowired
	private BucketListDAO bucketListDAO;
	
	public void insert(BucketListVO bucketListVO) {
		bucketListDAO.save(bucketListVO);
	}

	public List<BucketListVO> getBucketList(Integer id) {
		return bucketListDAO.searchForBucketList(id);
	}

	public List<BucketListVO> getBucketListData(Integer id) {
		return bucketListDAO.searchForBucketListData(id);
	}

	public void updateBucketListData(String name, String status, Integer id) {
		bucketListDAO.updateBucketListData(name, status, id);
	}

}
