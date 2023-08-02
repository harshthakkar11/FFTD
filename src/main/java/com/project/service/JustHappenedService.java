package com.project.service;

import java.util.List;

import com.project.VO.JustHappenedVO;

public interface JustHappenedService {

	public void insert(JustHappenedVO justHappenedVO);
	
	public List<JustHappenedVO> getList(int id);
}
