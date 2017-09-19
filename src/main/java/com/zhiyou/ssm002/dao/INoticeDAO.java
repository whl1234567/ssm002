package com.zhiyou.ssm002.dao;

import java.util.List;

import com.zhiyou.ssm002.model.Notice;

public interface INoticeDAO {

	public boolean doCreate() ;
	public boolean doRemove() ;
	public boolean doUpdate() ;
	public Notice findById() ;
	public List<Notice> findAll() ;
}
