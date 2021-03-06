package com.Han.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping("/user/login")
	//@ResponseBody
	public String login(@RequestParam("username") String username, 
						@RequestParam("password") String password,
						Model model,HttpSession session) {
		if(!StringUtils.isEmpty(username) && "Han".equals(password)) {
			session.setAttribute("loginUser", username);
			return "redirect:/dashboard";
		}else {
			model.addAttribute("msg","用户名或密码错误");
			return "redirect:/index";
		}
	}
	
	@RequestMapping("/user/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/index";
	}
	
	
}
