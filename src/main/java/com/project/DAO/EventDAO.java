package com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.VO.EventVO;
import com.project.VO.LoginVO;

public interface EventDAO extends JpaRepository<EventVO, Integer>{

	@Query("select e from EventVO e where e.currentUser.loginId=?")
	public List<EventVO> searchForEventList(Integer id);
	
	@Query("select distinct e.year from EventVO e where e.currentUser.loginId=? order by e.year asc")
	public List<EventVO> searchForEventYearsList(Integer id);
	
	@Query("select e from EventVO e where e.year=? group by e.eventName")
	public List<EventVO> searchForEventNameList(Integer year);
	
	@Query("select e from EventVO e where e.year=? and e.eventName=?")
	public List<EventVO> searchForEventFileList(Integer year, String eventName);
	
	@Query("select e.eventId from EventVO e where e.eventName=? and e.currentUser=?")
	public Integer searchEventIdByName(String name, LoginVO loginVO);
	
}
