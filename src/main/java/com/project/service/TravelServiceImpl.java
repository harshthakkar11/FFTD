package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.TravelDAO;
import com.project.VO.TravelVO;

@Service
public class TravelServiceImpl implements TravelService{

	@Autowired
	private TravelDAO travelDAO;
	
	public void insert(TravelVO travelVO) {
		travelDAO.save(travelVO);
	}

	public List<TravelVO> getTravelYearList(int id) {
		return travelDAO.searchByTravelYear(id);
	}

	public List<TravelVO> getTravelCountryList(int id) {
		return travelDAO.searchByTravelCountry(id);
	}

	public List<TravelVO> getTravelPlaceList(int id) {
		return travelDAO.searchByTravelPlace(id);
	}

	public List<TravelVO> getTravelYearSelectionList(int id, int year) {
		return travelDAO.searchByTravelYearSelection(id, year);
	}

	public List<TravelVO> getTravelCpuntrySelectionList(int id, String country) {
		return travelDAO.searchByTravelCountrySelection(id, country);
	}

	public List<TravelVO> getTravelPlaceSelectionList(int id, String place) {
		return travelDAO.searchByTravelPlaceSelection(id, place);
	}

}
