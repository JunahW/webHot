package com.webhot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webhot.demo.dao.UserDao;
import com.webhot.demo.pojo.User;
import com.webhot.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao UserDao;
	
	
	@Override
	public List<User> selectAllUser() {
		List<User> list = UserDao.selectAlluser();
		return list;
	}

}
