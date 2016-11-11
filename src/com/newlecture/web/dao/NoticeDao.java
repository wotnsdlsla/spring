package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.entities.Notice;
import com.newlecture.web.model.NoticeModel;

public interface NoticeDao {
	Notice get(String code);//�����ͺ��̽��� �ִ� �����͸� ��üȭ���� �޾� ����� ���̱� ������ 
	List<NoticeModel> getList(int page, String field, String query);
	List<NoticeModel> getList(int page);
	List<NoticeModel> getList();
	
	int insert(Notice notice);
	int update(Notice notice);
	int delete(String code);
	int getCount(String field, String query);
	int hitUp(String code);
	Notice getPrev(String code);
	Notice getNext(String code);
	String getlastCode();
}