package com.project.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.VO.TravelVO;

public interface TravelDAO extends JpaRepository<TravelVO, Integer>{

	@Query("select t from TravelVO t where t.currentUser.loginId=? group by t.year")
	public List<TravelVO> searchByTravelYear(Integer id);
	
	@Query("select t from TravelVO t where t.currentUser.loginId=? group by t.country")
	public List<TravelVO> searchByTravelCountry(Integer id);
	
	@Query("select t from TravelVO t where t.currentUser.loginId=? group by t.place")
	public List<TravelVO> searchByTravelPlace(Integer id);
	
	@Query("select t from TravelVO t where t.currentUser.loginId=? and t.year=?")
	public List<TravelVO> searchByTravelYearSelection(Integer id, Integer year);
	
	@Query("select t from TravelVO t where t.currentUser.loginId=? and t.country=?")
	public List<TravelVO> searchByTravelCountrySelection(Integer id, String country);
	
	@Query("select t from TravelVO t where t.currentUser.loginId=? and t.place=?")
	public List<TravelVO> searchByTravelPlaceSelection(Integer id, String place);
}
