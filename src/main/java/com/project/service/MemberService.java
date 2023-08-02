package com.project.service;

import java.util.List;

import com.project.VO.LoginVO;
import com.project.VO.MemberVO;

public interface MemberService {

	public void insert(MemberVO memberVO);
	
	public Integer getMemberId(String username);
	
	public List<MemberVO> getListById(Integer id);
	
	public List<MemberVO> getFriendList(Integer loginVo);
	
	public List<MemberVO> getFamilyList(Integer loginVo);
	
}
