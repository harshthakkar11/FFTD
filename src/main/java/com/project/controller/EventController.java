package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.VO.EventVO;
import com.project.VO.LoginVO;
import com.project.VO.TravelVO;
import com.project.service.EventService;
import com.project.service.LoginService;
import com.project.util.BaseMethods;

@Controller
public class EventController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private EventService eventService;
	
	@Autowired
	private BaseMethods baseMethods;
	
	@GetMapping(value = "user/eventsPage")
	public ModelAndView eventsPage() {

		List<EventVO> eventList = eventService.getEventYearList(loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/events", "add", new LoginVO()).addObject("eventVo", new EventVO())
				.addObject("eventlist", eventList);
	}

	@PostMapping(value = "user/saveEvent")
	public ModelAndView saveEvent(EventVO eventVo, HttpServletRequest httpServletRequest) {

		System.out.println(eventVo.getEventFileName());

		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginService.getUserId(baseMethods.getUser()));

		eventVo.setCurrentUser(loginVO);
		eventService.insert(eventVo);

		List<EventVO> eventList = eventService.getEventYearList(loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/events").addObject("add", new LoginVO()).addObject("eventlist", eventList)
				.addObject("eventVo", new EventVO());

	}

	@GetMapping(value = "user/eventNameList")
	public ModelAndView eventNameList(@RequestParam(required = false) String eyear,
			HttpServletRequest httpServletRequest) {

		Integer eYear = Integer.parseInt(eyear);
		List<EventVO> eventNameList = eventService.getEventNameList(eYear);

		return new ModelAndView("user/eventGallery").addObject("add", new LoginVO()).addObject("eventNameList",
				eventNameList);
	}

	@GetMapping(value = "user/eventPostPage")
	public ModelAndView eventPostPage(@RequestParam(required = false) String year,
			@RequestParam(required = false) String eName, HttpServletRequest httpServletRequest) {

		Integer eYear = Integer.parseInt(year);
		List<EventVO> eventFileList = eventService.getEventFileList(eYear, eName);

		return new ModelAndView("user/eventPostPage").addObject("add", new LoginVO())
				.addObject("eventFileList", eventFileList).addObject("eventName", eName);
	}

	@GetMapping(value = "user/travelPage")
	public ModelAndView travelPage() {

		return new ModelAndView("user/travel", "add", new LoginVO()).addObject("travelVo", new TravelVO());
	}
	
}
