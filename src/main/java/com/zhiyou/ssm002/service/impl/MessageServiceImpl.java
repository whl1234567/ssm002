package com.zhiyou.ssm002.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.ssm002.dao.IMessageDAO;
import com.zhiyou.ssm002.model.Message;
import com.zhiyou.ssm002.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	
	@Autowired
	private IMessageDAO messageDao;

	@Override
	public boolean add(Message vo) {
		return messageDao.doCreate(vo);
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Message vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Message findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findAll() {
		
		return messageDao.findAll();
	}

	@Override
	public List<Message> findAllReceive(Integer userId) {
		return messageDao.findAllReceive(userId);
	}

	@Override
	public List<Message> findAllSender(Integer userId) {
		return messageDao.findAllSender(userId);
	}

	@Override
	public List<Message> findAllSave(Message vo) {
		return messageDao.findAllSave(vo);
	}

	@Override
	public List<Message> findAllRemove(Message vo) {
		return messageDao.findAllRemove(vo);
	}


}
