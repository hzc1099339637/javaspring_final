package com.cai.service;

import com.cai.bean.User;

public interface UserService {
	int register(User user);
	public int login(String username,String userpassword);
}
