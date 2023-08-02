package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.MemberDAO;
import com.project.VO.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memberDAO;
	
	public Integer getMemberId(String username) {
		Integer memberId = memberDAO.searchByUsername(username);
		return memberId;
	}

	public void insert(MemberVO memberVO) {
		memberDAO.save(memberVO);
	}

	public List<MemberVO> getFriendList(Integer loginVo) {
		return memberDAO.searchForFriendsList(loginVo);
	}

	public List<MemberVO> getFamilyList(Integer loginVo) {
		return memberDAO.searchForFamily(loginVo);
	}

	public List<MemberVO> getListById(Integer id) {
		return memberDAO.searchByLoginId(id);
	}

}
