package com.zhiyou.ssm002.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.ssm002.model.Message;
import com.zhiyou.ssm002.model.User;
import com.zhiyou.ssm002.service.IMessageService;
import com.zhiyou.ssm002.service.IUserService;
import com.zhiyou.ssm002.utils.ConstantUtils;

@Controller
@Scope(scopeName="prototype")
@RequestMapping
public class MessageAction {
	Logger log = Logger.getLogger(MessageAction.class);
	
	@Autowired
	private IUserService userService;
	@Autowired
	private IMessageService messageService;

	@RequestMapping("/message/save")
	public String save(Message vo, ModelMap map, HttpServletRequest request) {
		log.info("====message====save====" + vo);
		String send = request.getParameter("send");
		String save = request.getParameter("save");
		if("发送".equals(send)) { // 发送状态...
			log.info("====发送====");
//			message_id,subject,content,sender,save_time,send_time,
//			send_delete,send_status,send_update_time,receiver,
//			receive_delete,receive_status,receive_update_time
			vo.setSender(1);
			vo.setSaveTime(new Date());
			vo.setSendTime(new Date());
			vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
			vo.setSendStatus(ConstantUtils.SEND_STATUS_SUCCESS);
			vo.setSendUpdateTime(new Date());
			vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_NORMAL);
			vo.setReceiveStatus(ConstantUtils.RECEIVE_STATUS_UNREAD);
			vo.setReceiveUpdateTime(new Date());
			
			
			boolean flag = messageService.add(vo);
			
			//			boolean flag = false;
			if(flag) {
				log.info("====message====listSend====");
				List<Message> list = messageService.findAll();
				map.put("list", list);
				
				return "/message/listSend";
			}else {
				return "redirect:/message/save.action";
			}
		}else if("保存草稿".equals(save)) {
			
			return "/message/listSave";
		}else {
			List<User> list = userService.findAllReceiver();
			map.put("users", list);
		}
		
		return "/message/save";
	}
	
	@RequestMapping("/message/listReceive")
	public String listReceive(ModelMap map) {
		log.info("====message====listReceive====");
		List<Message> list = messageService.findAllReceive(1);
		map.put("list", list);
		return "/message/listReceive";
	}
	
	@RequestMapping("/message/listSend")
	public String listSend(ModelMap map) {
		log.info("====message====listSend====");
		List<Message> list = messageService.findAllSender(1);
		map.put("list", list);
		return "/message/listSend";
	}
	
	@RequestMapping("/message/listSave")
	public String listSave(ModelMap map) {
		log.info("====message====listSave====");
		Message vo = new Message();
		vo.setSender(1);
		vo.setSendStatus(ConstantUtils.SEND_STATUS_DRAFT);
		List<Message> list = messageService.findAllSave(vo);
		map.put("list", list);
		return "/message/listSend";
	}
	
	@RequestMapping("/message/listRemove")
	public String listRemove(ModelMap map) {
		log.info("====message====listRemove====");
		Message vo = new Message();
		vo.setReceiver(1);
		vo.setSender(1);
		vo.setSendDelete(ConstantUtils.SEND_DELETE_DUST);
		vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_DUST);
		List<Message> list = messageService.findAllRemove(vo);
		map.put("list", list);
		return "/message/listRemove";
	}
}
