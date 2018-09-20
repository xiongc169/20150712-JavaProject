package com.yoong.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yoong
 *
 * @desc http://127.0.0.1:8080/user/login
 *
 * @date 2018年9月20日
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody
	@RequestMapping("/login")
	public String login(String name) {
		return "Hello " + name;
	}

}
