package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.RegisterDAO;
import com.project.VO.RegisterVO;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterDAO registerDao;
	
	public void insert(RegisterVO registerVO) {
		registerDao.save(registerVO);
	}

}
