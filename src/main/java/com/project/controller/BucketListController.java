package com.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.VO.BucketListCompletedVO;
import com.project.VO.BucketListVO;
import com.project.VO.LoginVO;
import com.project.service.BucketListCompletedService;
import com.project.service.BucketListService;
import com.project.service.LoginService;
import com.project.util.BaseMethods;

@Controller
public class BucketListController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private BucketListService bucketListService;

	@Autowired
	private BucketListCompletedService bucketListCompletedService;

	@Autowired
	private BaseMethods baseMethods;

	@GetMapping(value = "user/bucketListPage")
	public ModelAndView bucketListPage() {

		List<BucketListVO> toBeCompletedList = bucketListService
				.getBucketList(loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/bucketList", "add", new LoginVO()).addObject("bucketListVo", new BucketListVO())
				.addObject("bucketListCompletedVo", new BucketListCompletedVO())
				.addObject("toBeCompletedList", toBeCompletedList);
	}

	@PostMapping(value = "user/saveBucketList")
	public ModelAndView saveBucketList(BucketListVO bucketListVO) {

		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginService.getUserId(baseMethods.getUser()));

		bucketListVO.setCurrentUser(loginVO);
		bucketListService.insert(bucketListVO);

		return new ModelAndView("redirect:/user/bucketListPage");
	}

	@PostMapping(value = "user/saveBucketListCompletedPost")
	public ModelAndView saveBucketListCompletedPost(BucketListCompletedVO bucketListCompletedVO) {

		bucketListCompletedService.insert(bucketListCompletedVO);

		return new ModelAndView("redirect:/user/bucketListPage");
	}

	@GetMapping(value = "user/BucketListCompletedPage")
	public ModelAndView BucketListCompletedPage(@RequestParam(required = false) Integer id) {

		List<BucketListCompletedVO> bucketListCompletedPosts = bucketListCompletedService.getBucketCompletedList(id,
				loginService.getUserId(baseMethods.getUser()));

		return new ModelAndView("user/bucketListCompletedPostPage", "add", new LoginVO()).addObject("completedPosts",
				bucketListCompletedPosts).addObject("name", bucketListCompletedPosts.get(0).getBucketListVO().getBucketList());
	}

	@PostMapping(value = "user/updateBucketList")
	public ModelAndView updateBucketList(BucketListVO bucketListVO) {

		bucketListService.updateBucketListData(bucketListVO.getBucketList(), bucketListVO.getStatus(),
				bucketListVO.getBucketListId());

		return new ModelAndView("redirect:/user/bucketListPage");
	}

	@GetMapping(value = "user/getBucketListData")
	public ResponseEntity getBucketListData(@RequestParam int Id) {

		List<BucketListVO> bucketListData = bucketListService.getBucketListData(Id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", bucketListData.get(0).getBucketList());
		map.put("id", bucketListData.get(0).getBucketListId());

		return new ResponseEntity(map, HttpStatus.OK);

	}

}
