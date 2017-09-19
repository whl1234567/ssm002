package com.zhiyou.ssm002.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.ssm002.dao.IUserDAO;
import com.zhiyou.ssm002.model.User;
import com.zhiyou.ssm002.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDAO  userDao;
	
	@Override
	public boolean add(User vo) {
		return userDao.doCreate();
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(User vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		return null;
	}

	@Override
	public List<User> findAllReceiver() {
		return userDao.findAllReceiver();
	}

}
