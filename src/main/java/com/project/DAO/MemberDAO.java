package com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.VO.MemberVO;

public interface MemberDAO extends JpaRepository<MemberVO, Integer>{

	@Query("select m.memberId from MemberVO m where m.userName=?")
	public Integer searchByUsername(String username);
	
	@Query("select m from MemberVO m where m.loginVO.loginId=?")
	public List<MemberVO> searchByLoginId(Integer loginId);
	
	@Query("select m from MemberVO m where m.loginVO.loginId=? and category='Friend' ")
	public List<MemberVO> searchForFriendsList(Integer loginId);
	
	@Query("select m from MemberVO m where m.loginVO.loginId=? and category!='Friend'")
	public List<MemberVO> searchForFamily(Integer id);
	
}
