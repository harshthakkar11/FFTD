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
import org.springframework.web.servlet.ModelAndView;

import com.project.VO.EventVO;
import com.project.VO.JustHappenedVO;
import com.project.VO.LoginVO;
import com.project.service.EventService;
import com.project.service.JustHappenedService;
import com.project.service.LoginService;
import com.project.util.BaseMethods;

@Controller
public class JustHappenedController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private EventService eventService;
	
	@Autowired
	private JustHappenedService justHappenedService;

	@Autowired
	private BaseMethods baseMethods;

	@GetMapping(value = "user/JustHappenedPage")
	public ModelAndView JustHappenedPage() throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Date date = new Date();

		List<JustHappenedVO> list = justHappenedService.getList(loginService.getUserId(baseMethods.getUser()));
		List<JustHappenedVO> justHappenedList = new ArrayList<JustHappenedVO>();

		for (int i = 0; i < list.size(); i++) {
			long timeDiff = Math.abs(date.getTime() - formatter.parse(list.get(i).getDate()).getTime());
			long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);

			if (daysDiff < list.get(i).getExpDays()) {
				justHappenedList.add(list.get(i));
			}else {
				EventVO eventVO = new EventVO();
				eventVO.setEventFileName(list.get(i).getJustHappenedFileName());
				eventVO.setEventName(list.get(i).getEventName());
				eventVO.setYear(list.get(i).getYear());
				eventVO.setCurrentUser(list.get(i).getCurrentUser());
				eventService.insert(eventVO);
			}
		}

		return new ModelAndView("user/JustHappened", "add", new LoginVO())
				.addObject("justHappenedVo", new JustHappenedVO()).addObject("list", justHappenedList);
	}

	@PostMapping(value = "user/saveJustHappenedPost")
	public ModelAndView saveJustHappenedPost(JustHappenedVO justhappenedVo, HttpServletRequest httpServletRequest)
			throws ParseException {

		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginService.getUserId(baseMethods.getUser()));

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Date date = new Date();

		justhappenedVo.setCurrentUser(loginVO);
		justhappenedVo.setDate(formatter.format(date));
		justHappenedService.insert(justhappenedVo);

		List<JustHappenedVO> list = justHappenedService.getList(loginService.getUserId(baseMethods.getUser()));
		List<JustHappenedVO> justHappenedList = new ArrayList<JustHappenedVO>();

		for (int i = 0; i < list.size(); i++) {
			long timeDiff = Math.abs(date.getTime() - formatter.parse(list.get(i).getDate()).getTime());
			long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);

			if (daysDiff < list.get(i).getExpDays()) {
				justHappenedList.add(list.get(i));
			}
		}

		return new ModelAndView("user/JustHappened").addObject("add", new LoginVO())
				.addObject("justHappenedVo", new JustHappenedVO()).addObject("list", justHappenedList);

	}

}
