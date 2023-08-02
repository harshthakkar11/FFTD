package com.project.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.VO.EventVO;
import com.project.VO.JustHappenedVO;
import com.project.VO.LoginVO;
import com.project.VO.MemberVO;
import com.project.VO.TravelVO;
import com.project.service.EventService;
import com.project.service.JustHappenedService;
import com.project.service.LoginService;
import com.project.service.MemberService;
import com.project.service.TravelService;
import com.project.util.BaseMethods;

@Controller
public class MemberController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private MemberService memberService;

	@Autowired
	private EventService eventService;

	@Autowired
	private BaseMethods baseMethods;

	@PostMapping(value = "user/addMember")
	public ModelAndView addMember(HttpServletRequest httpServletRequest) {

		System.out.println("enter");
		List<LoginVO> loginVO = loginService.getUserDetails(httpServletRequest.getParameter("username"));

		if (!loginVO.isEmpty()) {
			// Check in member table
			Integer memberId = memberService.getMemberId(loginVO.get(0).getUsername());

			if (memberId != null) {
				System.out.println("Already exist");
				return new ModelAndView("user/addMember").addObject("add", new LoginVO()).addObject("msg",
						"User Already exist in your Friend list");
				// User already exist
			} else {
				System.out.println("Add member");
				return new ModelAndView("user/addMember", "MemberList", loginVO).addObject("add", new LoginVO());
			}

		} else {
			// User does not exists
			System.out.println("User does not exist");
			return new ModelAndView("user/addMember").addObject("add", new LoginVO()).addObject("msg",
					"User Does not exist");
		}
	}

	@PostMapping(value = "user/saveMember")
	public ModelAndView saveMember(HttpServletRequest httpServletRequest) {

		String type = httpServletRequest.getParameter("type");
		String role = httpServletRequest.getParameter("role");
		String userName = httpServletRequest.getParameter("username");
//		String loginId = httpServletRequest.getParameter("loginId");
		String currentUsername = baseMethods.getUser();

		System.out.println(userName);

		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginService.getUserId(currentUsername));

		MemberVO memberVO = new MemberVO();

		if (type.equalsIgnoreCase("Friend")) {
			memberVO.setLevel(0);
		} else if (type.equalsIgnoreCase("Grand Father") || type.equalsIgnoreCase("Grand Mother")) {
			memberVO.setLevel(1);
		} else if (type.equalsIgnoreCase("Father") || type.equalsIgnoreCase("Mother")) {
			memberVO.setLevel(2);
		} else if (type.equalsIgnoreCase("Brother") || type.equalsIgnoreCase("Sister")) {
			memberVO.setLevel(3);
		} else if (type.equalsIgnoreCase("Son") || type.equalsIgnoreCase("Daughter")) {
			memberVO.setLevel(4);
		}
		memberVO.setCategory(type);
		memberVO.setRole(Integer.parseInt(role));
		memberVO.setUserName(userName);
		memberVO.setLoginVO(loginVO);

		memberService.insert(memberVO);

		return new ModelAndView("user/index").addObject("add", new LoginVO());
	}

	@RequestMapping(value = "user/membersGallery")
	public ModelAndView membersGallery(@RequestParam String userName, HttpServletRequest httpServletRequest) {

		List<EventVO> membersPostList = eventService.getEventList(loginService.getUserId(userName));

		return new ModelAndView("user/coordinatorMembersGallery").addObject("add", new LoginVO())
				.addObject("membersPosts", membersPostList).addObject("uName", userName).addObject("eventVo", new EventVO());
	}
	
	@PostMapping(value = "user/saveEventFromCoordinator")
	public ModelAndView saveEventFromCoordinator(EventVO eventVO, @RequestParam String username, HttpServletRequest httpServletRequest) {

		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginService.getUserId(username));

		eventVO.setCurrentUser(loginVO);
		eventService.insert(eventVO);

		return new ModelAndView("redirect:/user/membersGallery?userName=" + username);
	}

//	@RequestMapping(value = "user/eventGallery")
//	public ModelAndView eventGallery(@RequestParam(required = false) String eN, HttpServletRequest httpServletRequest) {
//
//		String event = httpServletRequest.getParameter("eN");
//		System.out.println(eN);
//
//		LoginVO loginVO = new LoginVO();
//		loginVO.setLoginId(loginService.getUserId(baseMethods.getUser()));
//
//		List<EventGalleryVO> eventFileList = eventGalleryService.getEventFileList(event, loginVO);
//
//		return new ModelAndView("user/eventGallery").addObject("add", new LoginVO())
//				.addObject("eventGallery", new EventGalleryVO()).addObject("event", event)
//				.addObject("eventFileList", eventFileList);
//
//	}

//	@PostMapping(value = "user/saveEventPost")
//	public ModelAndView saveEventPost(EventGalleryVO eventGalleryVO, HttpServletRequest httpServletRequest) {
//
//		String ename = httpServletRequest.getParameter("eventname");
//
//		LoginVO loginVO = new LoginVO();
//		loginVO.setLoginId(loginService.getUserId(baseMethods.getUser()));
//		eventGalleryVO.setUserName(loginVO);
//
//		EventVO eventVO = new EventVO();
//		eventVO.setEventId(eventService.getEventId(ename, loginVO));
//		eventGalleryVO.setEvenVo(eventVO);
//
//		System.out.println(eventGalleryVO.getfName());
//		eventGalleryService.insert(eventGalleryVO);
//
//		List<EventGalleryVO> eventFileList = eventGalleryService.getEventFileList(ename, loginVO);
//
//		return new ModelAndView("user/eventGallery").addObject("add", new LoginVO())
//				.addObject("eventGallery", new EventGalleryVO()).addObject("event", ename)
//				.addObject("eventFileList", eventFileList);
//
//	}
}
