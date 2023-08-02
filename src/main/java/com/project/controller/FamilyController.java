package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.VO.LoginVO;
import com.project.VO.MemberVO;
import com.project.service.LoginService;
import com.project.service.MemberService;
import com.project.util.BaseMethods;

@Controller
public class FamilyController {
	
	@Autowired
	private LoginService loginService;

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private BaseMethods baseMethods;
	
	@GetMapping(value = "user/familyPage")
	public ModelAndView family() {

		List<MemberVO> familyList = memberService.getFamilyList(loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/family", "add", new LoginVO()).addObject("familylist", familyList);
	}

	@RequestMapping(value = "user/familyGallery")
	public ModelAndView familyGallery(@RequestParam(required = false) String username) {

		return new ModelAndView("user/familyGallery", "add", new LoginVO());
	}
	
}
