package com.webhot.demo.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webhot.demo.pojo.User;
import com.webhot.demo.service.UserService;

@Controller
public class UersController {

	@Autowired
	private UserService UserService;

	/*
	 * 返回一个基本类型的
	 */
	@RequestMapping("/hello")
	public String sayHello() {

		return "hello_world";
	}

	@RequestMapping("/showUser")
	public User showUser() {
		User user = new User();
		user.setId(1);
		user.setUsername("jjjjj");
		return user;
	}

	@RequestMapping("/showList")
	public ArrayList<User> showList() {
		ArrayList<User> list = (ArrayList<User>) UserService.selectAllUser();

		return list;
	}

	@RequestMapping("/success")
	public String success(Map<String, String> map) {
		map.put("username", "junah");

		return "success";
	}
}
