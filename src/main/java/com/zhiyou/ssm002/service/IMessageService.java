package com.zhiyou.ssm002.service;

import java.util.List;

import com.zhiyou.ssm002.model.Message;

public interface IMessageService {

	public boolean add(Message vo);
	public boolean delete(Integer id);
	public boolean edit(Message vo);
	public Message findById(Integer id);
	public List<Message> findAll();
	/** 当前登录的用户的收件箱 
	 * @return */
	public List<Message> findAllReceive(Integer userId);
	public List<Message> findAllSender(Integer userId);
	public List<Message> findAllSave(Message vo);
	public List<Message> findAllRemove(Message vo);
	
	
	
}
