package com.project.service;

import java.util.List;

import com.project.VO.TravelVO;

public interface TravelService {

	public void insert(TravelVO travelVO);
	
	public List<TravelVO> getTravelYearList(int id);
	
	public List<TravelVO> getTravelCountryList(int id);
	
	public List<TravelVO> getTravelPlaceList(int id);
	
	public List<TravelVO> getTravelYearSelectionList(int id, int year);
	
	public List<TravelVO> getTravelCpuntrySelectionList(int id, String country);
	
	public List<TravelVO> getTravelPlaceSelectionList(int id, String place);
	
}
