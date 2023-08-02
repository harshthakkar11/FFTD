package com.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.DAO.RegisterDAO;
import com.project.VO.LoginVO;
import com.project.VO.RegisterVO;
import com.project.service.LoginService;
import com.project.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping(value = "register")
	public ModelAndView loadLogin() {
		return new ModelAndView("/register", "reg", new RegisterVO());
	}
	
	@PostMapping(value = "registerUser")
	public ModelAndView registerUser(RegisterVO registerVO, LoginVO loginVO, HttpServletRequest httpServletRequest) {
		
		loginVO = registerVO.getLoginVo();
		
		loginService.insert(loginVO);
		registerService.insert(registerVO);
		
		return new ModelAndView("redirect:/");
	}
}
