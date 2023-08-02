package com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.VO.JustHappenedVO;

public interface JustHappenedDAO extends JpaRepository<JustHappenedVO, Integer> {
	
	@Query("select j from JustHappenedVO j where j.currentUser.loginId=?")
	public List<JustHappenedVO> searchList(Integer id);
	
}
