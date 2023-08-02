package com.project.service;

import java.util.List;

import com.project.VO.EventVO;
import com.project.VO.LoginVO;

public interface EventService {

	public void insert(EventVO eventVO);
	
	public List<EventVO> getEventList(Integer id);
	
	public Integer getEventId(String name, LoginVO loginVO);
	
	public List<EventVO> getEventYearList(Integer id);
	
	public List<EventVO> getEventNameList(Integer year);
	
	public List<EventVO> getEventFileList(Integer year, String eventName);
}
