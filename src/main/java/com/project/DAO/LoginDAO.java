package com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.VO.LoginVO;

public interface LoginDAO extends JpaRepository<LoginVO, Integer> {

	@Query("select l.loginId from LoginVO l where l.username=? and l.enabled=1")
	public Integer searchByName(String username);
	
	@Query("select l from LoginVO l where l.username=? and l.enabled=1")
	public List<LoginVO> searchByUsername(String username);

}
