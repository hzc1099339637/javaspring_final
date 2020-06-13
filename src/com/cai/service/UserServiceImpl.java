package com.cai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cai.bean.User;
import com.cai.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}

	@Override
	public int login(String username, String userpassword) {
		// TODO Auto-generated method stub
		User user = userMapper.select(username);
		int flag = 0;
		if(user != null) {
			if(user.getName().equals(username)) {
				flag += 1;
				if(user.getPassword().equals(userpassword)) {
					flag += 1;
				}
			}
		}return flag;	
	}

}
