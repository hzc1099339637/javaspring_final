package com.cai.controller;


import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cai.bean.User;
import com.cai.service.UserService;
import com.cai.mapper.UserMapper;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	UserMapper userMapper;

	@RequestMapping("initlogin")
	public String initLogin() {
		return "login";
	}
	@RequestMapping("initregister")
	public String initRegister() {
		return "register";
	}
	@RequestMapping("usermain")
	public String main() {
		return "main";
	}
	@RequestMapping("/tologin")
	public  String login(User user,Model model,HttpSession session) {
		int loginType = userService.login(user.getName(), user.getPassword());
		if(loginType == 2) {
			//登录成功，将用户信息保存到session对象中
			session.setAttribute("user", user);
			//重定向到主页面
			return "redirect:usermain";
		}else if(loginType == 1) {
			model.addAttribute("msg", "密码错误，请重新登录 ！");
			return "login";
		}
		model.addAttribute("msg", "此用户不存在，如未注册请前往注册！");
		return "login";
	}
	@RequestMapping("/toregister")
	public String addUser(User user,Model model,HttpSession session) {
			int add = userService.register(user);
			if(add > 0) {
				model.addAttribute("msg", "注册成功，请登录！");
				return "login";
			}else{
				model.addAttribute("msg", "服务器出错，请尝试重新注册！");
				return "register";
			}
		}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//清楚session
		session.invalidate();
		return "login";
	}
} 
