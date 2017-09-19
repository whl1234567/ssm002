package com.zhiyou.ssm002.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Notice implements Serializable {

	private int noticeId;
	private int receiveId;
	private String subject;
	private String text;
	private Date pubTime;
	private Date expireTime;
	private int status;
	private String remark;
	private Date createTime;
	private int creater;
	private String createrName;
	private Date updateTime;
	private int updater;

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public int getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(int receiveId) {
		this.receiveId = receiveId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getPubTime() {
		return pubTime;
	}

	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getCreater() {
		return creater;
	}

	public void setCreater(int creater) {
		this.creater = creater;
	}

	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getUpdater() {
		return updater;
	}

	public void setUpdater(int updater) {
		this.updater = updater;
	}

	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", receiveId=" + receiveId + ", subject=" + subject + ", text=" + text
				+ ", pubTime=" + pubTime + ", expireTime=" + expireTime + ", status=" + status + ", remark=" + remark
				+ ", createTime=" + createTime + ", creater=" + creater + ", createrName=" + createrName
				+ ", updateTime=" + updateTime + ", updater=" + updater + "]";
	}

}
