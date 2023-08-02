package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.VO.LoginVO;
import com.project.VO.TravelVO;
import com.project.service.LoginService;
import com.project.service.TravelService;
import com.project.util.BaseMethods;

@Controller
public class TravelController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private TravelService travelService;
	
	@Autowired
	private BaseMethods baseMethods;
	
	@PostMapping(value = "user/saveTravelPost")
	public ModelAndView saveTravelPost(TravelVO travelVo, HttpServletRequest httpServletRequest) {

		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginService.getUserId(baseMethods.getUser()));

		travelVo.setCurrentUser(loginVO);
		travelService.insert(travelVo);

		return new ModelAndView("user/travel").addObject("add", new LoginVO()).addObject("travelVo", new TravelVO());

	}

	@GetMapping(value = "user/travelYear")
	public ModelAndView travelYear(HttpServletRequest httpServletRequest) {

		List<TravelVO> travelList = travelService.getTravelYearList(loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/travel").addObject("add", new LoginVO()).addObject("travelVo", new TravelVO())
				.addObject("travelList", travelList).addObject("sort", "year");

	}

	@GetMapping(value = "user/travelCountry")
	public ModelAndView travelCountry(HttpServletRequest httpServletRequest) {

		List<TravelVO> travelList = travelService.getTravelCountryList(loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/travel").addObject("add", new LoginVO()).addObject("travelVo", new TravelVO())
				.addObject("travelList", travelList).addObject("sort", "country");

	}

	@GetMapping(value = "user/travelPlace")
	public ModelAndView travelPlace(HttpServletRequest httpServletRequest) {

		List<TravelVO> travelList = travelService.getTravelPlaceList(loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/travel").addObject("add", new LoginVO()).addObject("travelVo", new TravelVO())
				.addObject("travelList", travelList).addObject("sort", "place");

	}

	@GetMapping(value = "user/travelGallery")
	public ModelAndView travelGallery(@RequestParam(required = false) String sort,
			@RequestParam(required = false) String select, HttpServletRequest httpServletRequest) {

		List<TravelVO> travelList;

		if (select.equalsIgnoreCase("year")) {
			travelList = travelService.getTravelYearSelectionList(loginService.getUserId(baseMethods.getUser()),
					Integer.parseInt(sort));
		} else if (select.equalsIgnoreCase("country")) {
			travelList = travelService.getTravelCpuntrySelectionList(loginService.getUserId(baseMethods.getUser()),
					sort);
		} else {
			travelList = travelService.getTravelPlaceSelectionList(loginService.getUserId(baseMethods.getUser()), sort);
		}

		return new ModelAndView("user/travelGallery").addObject("add", new LoginVO())
				.addObject("travelVo", new TravelVO()).addObject("travelList", travelList).addObject("select", sort);

	}
	
}
