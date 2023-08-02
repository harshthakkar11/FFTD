package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.VO.FriendsGalleryVO;
import com.project.VO.LoginVO;
import com.project.VO.MemberVO;
import com.project.service.FriendsGalleryService;
import com.project.service.LoginService;
import com.project.service.MemberService;
import com.project.util.BaseMethods;

@Controller
public class FriendController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private FriendsGalleryService friendsGalleryService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private BaseMethods baseMethods;
	
	@GetMapping(value = "user/friendsPage")
	public ModelAndView userIndex() {

		Integer loginId = loginService.getUserId(baseMethods.getUser());
		List<MemberVO> friendsList = memberService.getFriendList(loginId);

		return new ModelAndView("user/friends", "add", new LoginVO()).addObject("friendlist", friendsList);
	}

	@PostMapping(value = "user/friendPost")
	public ModelAndView friendsPost(HttpServletRequest httpServletRequest) {

		String name = httpServletRequest.getParameter("friendName");
		System.out.println(name);

		List<FriendsGalleryVO> friendGalleryList = friendsGalleryService.getFriendsGalleryList(baseMethods.getUser(),
				name);

		return new ModelAndView("user/friendsGallery").addObject("add", new LoginVO()).addObject("friendName", name)
				.addObject("friendsData", new FriendsGalleryVO()).addObject("galleryList", friendGalleryList);
	}

	@PostMapping(value = "user/saveImage")
	public ModelAndView saveGallery(FriendsGalleryVO friendsGalleryVO, HttpServletRequest httpServletRequest) {

		String currentUsername = baseMethods.getUser();
		String friendsUser = httpServletRequest.getParameter("friendsUsername");

		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginService.getUserId(currentUsername));
		friendsGalleryVO.setUser(loginVO);

		LoginVO loginVO2 = new LoginVO();
		loginVO2.setLoginId(loginService.getUserId(friendsUser));
		friendsGalleryVO.setFriend(loginVO2);

		friendsGalleryService.insert(friendsGalleryVO);
		List<FriendsGalleryVO> friendGalleryList = friendsGalleryService.getFriendsGalleryList(baseMethods.getUser(),
				friendsUser);

		return new ModelAndView("user/friendsGallery").addObject("add", new LoginVO())
				.addObject("friendName", friendsUser).addObject("friendsData", new FriendsGalleryVO())
				.addObject("galleryList", friendGalleryList);
	}

	@PostMapping(value = "user/deletePost")
	public ModelAndView deleteImage(HttpServletRequest httpServletRequest) {

		Integer fileId = Integer.parseInt(httpServletRequest.getParameter("fileId"));
		String userName = httpServletRequest.getParameter("username");
		String friendsName = httpServletRequest.getParameter("friendName");

		friendsGalleryService.deletePost(fileId);
		List<FriendsGalleryVO> friendGalleryList = friendsGalleryService.getFriendsGalleryList(userName, friendsName);

		return new ModelAndView("user/friendsGallery").addObject("add", new LoginVO())
				.addObject("friendName", friendsName).addObject("friendsData", new FriendsGalleryVO())
				.addObject("galleryList", friendGalleryList);
	}

}
