package com.project.service;

import java.util.List;

import com.project.VO.LoginVO;

public interface LoginService {
	
	public void insert(LoginVO loginVo);
	
	public List getUserDetails(String username);

	public Integer getUserId(String username);
	
}
