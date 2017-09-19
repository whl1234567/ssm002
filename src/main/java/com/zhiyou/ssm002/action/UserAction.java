package com.zhiyou.ssm002.action;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.ssm002.model.User;

@Controller
@Scope(scopeName="prototype")
@RequestMapping()
public class UserAction {
	Logger log = Logger.getLogger(UserAction.class);
	
	@RequestMapping("/user/login")
	public String login(User user) {
		log.info("====login====" + user );
		return "/admin";
	}
	
	@RequestMapping("/user/listview")
	public String listView() {
		log.info("====user====listview====");
		return "/user/listview";
	}
}
