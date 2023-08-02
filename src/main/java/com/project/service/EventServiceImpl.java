package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.EventDAO;
import com.project.VO.EventVO;
import com.project.VO.LoginVO;

@Service
public class EventServiceImpl implements EventService{

	@Autowired
	private EventDAO eventDAO;
	
	public void insert(EventVO eventVO) {
		eventDAO.save(eventVO);
	}

	public List<EventVO> getEventList(Integer id) {
		return eventDAO.searchForEventList(id);
	}

	public Integer getEventId(String name, LoginVO loginVO) {
		return eventDAO.searchEventIdByName(name, loginVO);
	}

	public List<EventVO> getEventYearList(Integer id) {
		return eventDAO.searchForEventYearsList(id);
	}

	public List<EventVO> getEventNameList(Integer year) {
		return eventDAO.searchForEventNameList(year);
	}

	public List<EventVO> getEventFileList(Integer year, String eventName) {
		return eventDAO.searchForEventFileList(year, eventName);
	}

}
