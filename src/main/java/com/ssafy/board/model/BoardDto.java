package com.ssafy.board.model;

import java.util.Date;

public class BoardDto {
	private int idx;
	private String userId;
	private String subject;
	private String content;
	private int hit;
	private int like;
	private Date registDate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	
	@Override
	public String toString() {
		return "BoardDto [idx=" + idx + ", userId=" + userId + ", subject=" + subject + ", content=" + content
				+ ", hit=" + hit + ", like=" + like + ", registDate=" + registDate + "]";
	}
}
