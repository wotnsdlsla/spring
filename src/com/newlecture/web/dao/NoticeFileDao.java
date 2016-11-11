package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.entities.NoticeFile;

public interface NoticeFileDao {
	List<NoticeFile> getList(String noticeCode);
	
	int insert(NoticeFile file);
	int update(NoticeFile file);
	int delete(String code);
}