package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.LoginDAO;
import com.project.VO.LoginVO;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDao;

	public void insert(LoginVO loginVo) {
		loginVo.setEnabled(1);
		loginVo.setRole("ROLE_USER");
		loginDao.save(loginVo);
	}

	public List getUserDetails(String username) {
		return loginDao.searchByUsername(username);
	}

	public Integer getUserId(String username) {
		return loginDao.searchByName(username);
	}

}
