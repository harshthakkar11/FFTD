package com.project.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class BaseMethods {

	public String getUser() {
		User userName = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return userName.getUsername();
	}

}
