package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.JustHappenedDAO;
import com.project.VO.JustHappenedVO;

@Service
public class JustHappenedServiceImpl implements JustHappenedService{

	@Autowired
	private JustHappenedDAO justHappenedDAO;
	
	public void insert(JustHappenedVO justHappenedVO) {
		justHappenedDAO.save(justHappenedVO);
	}

	public List<JustHappenedVO> getList(int id) {
		return justHappenedDAO.searchList(id);
	}

}
