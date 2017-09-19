package com.zhiyou.ssm002.dao;

import java.util.List;

import com.zhiyou.ssm002.model.Message;

public interface IMessageDAO {

	public boolean doCreate(Message vo) ;
	public boolean doRemove(Integer id) ;
	public boolean doUpdate(Message vo) ;
	public Message findById(Integer id) ;
	public List<Message> findAll() ;
	public List<Message> findAllReceive(Integer userId);
	public List<Message> findAllSender(Integer userId);
	public List<Message> findAllSave(Message vo);
	public List<Message> findAllRemove(Message vo);
}
