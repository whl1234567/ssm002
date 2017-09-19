package com.zhiyou.ssm002.action;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope(scopeName="prototype")
@RequestMapping("/department/*")
public class DepartmentAction {
	Logger log = Logger.getLogger(DepartmentAction.class);
	
	@RequestMapping("listview")
	public String listview() {
		log.info("====dept====listview");
		return "/department/listview";
	}
}
