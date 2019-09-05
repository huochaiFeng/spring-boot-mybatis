package com.hwadee.smbms.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hwadee.smbms.service.UserService;


@Controller
@RequestMapping("/sys/user")
public class UserController extends BaseController{
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	

	
}
