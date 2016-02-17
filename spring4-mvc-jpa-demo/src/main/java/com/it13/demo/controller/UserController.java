package com.it13.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it13.demo.domain.User;
import com.it13.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/findAll")
	 public ModelAndView hello(String name) {
		return new ModelAndView("users").addObject("users", userService.findAll());
	 }

	@RequestMapping("/user/save")
	 public ModelAndView save(String name) {
		User u = new User();
		u.setName(name);
		return new ModelAndView("users").addObject("users", userService.save(u));
	 }

	@RequestMapping("/user/updateNameById")
	 public ModelAndView updateNameById(Long id, String name) {
		return new ModelAndView("users").addObject("users", userService.updateNameById(id, name));
	 }

	@RequestMapping("/user/del")
	 public ModelAndView del(Long id) {
		return new ModelAndView("users").addObject("users", userService.del(id));
	 }
	
}
