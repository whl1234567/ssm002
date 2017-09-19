package com.zhiyou.ssm002.service;

import java.util.List;

import com.zhiyou.ssm002.model.Notice;
import com.zhiyou.ssm002.model.User;

public interface IUserService {

	public boolean add(User vo);
	public boolean delete(Integer id);
	public boolean edit(User vo);
	public User findById(Integer id);
	public List<User> findAll();
	
	public List<User> findAllReceiver();
	
	
	
}
