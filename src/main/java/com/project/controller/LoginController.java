package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.VO.LoginVO;
import com.project.VO.MemberVO;
import com.project.service.LoginService;
import com.project.service.MemberService;
import com.project.util.BaseMethods;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private MemberService memberService;

	@Autowired
	private BaseMethods baseMethods;

	@GetMapping(value = "/")
	public ModelAndView loadLogin() {
		return new ModelAndView("/login");
	}

	@GetMapping(value = "/admin/index")
	public ModelAndView adminIndex() {
		return new ModelAndView("admin/index");
	}

	@GetMapping(value = "/user/index")
	public ModelAndView userIndex() {

		List<MemberVO> memberList = memberService.getListById(loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/index", "add", new LoginVO()).addObject("alreadyExist", false)
				.addObject("memberList", memberList);
	}

	@RequestMapping(value = "/logout", method = { RequestMethod.POST, RequestMethod.GET })
	public String viewUserDetails(ModelMap model, HttpServletResponse response, HttpServletRequest request) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			request.getSession().invalidate();
			request.getSession().setAttribute("statusText", "Logout successfully");
			request.getSession().setAttribute("tempStatus", "success");
		}
		return "/login";
	}

	@GetMapping(value = "/login")
	public ModelAndView load() {

		return new ModelAndView("/login");
	}

	@GetMapping(value = "/403")
	public ModelAndView load403() {
		return new ModelAndView("/login");
	}

	@GetMapping(value = "/error")
	public ModelAndView error() {
		return new ModelAndView("/login");
	}

	@GetMapping(value = "/404")
	public ModelAndView handle404() {
		return new ModelAndView("404");
	}
}