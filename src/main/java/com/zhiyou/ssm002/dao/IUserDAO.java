package com.zhiyou.ssm002.dao;

import java.util.List;

import com.zhiyou.ssm002.model.Notice;
import com.zhiyou.ssm002.model.User;

public interface IUserDAO {

	public boolean doCreate() ;
	public boolean doRemove() ;
	public boolean doUpdate() ;
	public User findById() ;
	public List<User> findAll() ;
	
	public List<User> findAllReceiver();
}
