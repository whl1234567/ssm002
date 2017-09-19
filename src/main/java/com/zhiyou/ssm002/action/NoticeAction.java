package com.zhiyou.ssm002.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.ssm002.model.Notice;
import com.zhiyou.ssm002.service.INoticeService;

@Controller
@Scope(scopeName="prototype")
@RequestMapping
public class NoticeAction {
	Logger log = Logger.getLogger(NoticeAction.class);
	
	@Autowired
	private INoticeService service;
	
	@RequestMapping("/notice/listview")
	public String listView(ModelMap map) {
		log.info("====notice====listview====");
		List<Notice> list = service.findAll();
		map.put("list", list);
		return "/notice/listview";
	}
}
