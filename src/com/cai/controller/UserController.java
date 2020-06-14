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
			//��¼�ɹ������û���Ϣ���浽session������
			session.setAttribute("user", user);
			//�ض�����ҳ��
			return "redirect:usermain";
		}else if(loginType == 1) {
			model.addAttribute("msg", "������������µ�¼ ��");
			return "login";
		}
		model.addAttribute("msg", "���û������ڣ���δע����ǰ��ע�ᣡ");
		return "login";
	}
	@RequestMapping("/toregister")
	public String addUser(User user,Model model,HttpSession session) {
			int add = userService.register(user);
			if(add > 0) {
				model.addAttribute("msg", "ע��ɹ������¼��");
				return "login";
			}else{
				model.addAttribute("msg", "�����������볢������ע�ᣡ");
				return "register";
			}
		}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//���session
		session.invalidate();
		return "login";
	}
} 
