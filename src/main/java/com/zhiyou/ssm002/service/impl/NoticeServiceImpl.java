package com.zhiyou.ssm002.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.ssm002.dao.INoticeDAO;
import com.zhiyou.ssm002.model.Notice;
import com.zhiyou.ssm002.service.INoticeService;

@Service
public class NoticeServiceImpl implements INoticeService {

	@Autowired
	private INoticeDAO noticeDao;
	
	@Override
	public boolean add(Notice vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Notice vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Notice findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notice> findAll() {
		return this.noticeDao.findAll();
	}

}
