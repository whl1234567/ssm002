package com.zhiyou.ssm002.service;

import java.util.List;

import com.zhiyou.ssm002.model.Notice;

public interface INoticeService {

	public boolean add(Notice vo);
	public boolean delete(Integer id);
	public boolean edit(Notice vo);
	public Notice findById(Integer id);
	public List<Notice> findAll();
	
	
	
}
