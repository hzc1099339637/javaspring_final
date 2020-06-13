package com.cai.mapper;

import com.cai.bean.User;

public interface UserMapper {
	public int add(User user);
	public User select(String name);

}
