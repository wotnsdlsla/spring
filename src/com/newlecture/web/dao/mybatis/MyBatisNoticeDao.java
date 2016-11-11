package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entities.Notice;
import com.newlecture.web.model.NoticeModel;

public class MyBatisNoticeDao implements NoticeDao{
	private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public Notice get(String code){
		
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		return noticeDao.get(code);
	}

	@Override
	public List<NoticeModel> getList(int page, String field, String query){
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		List<NoticeModel> result=noticeDao.getList(page, field, query);
		
		return result;
	}

	@Override
	public List<NoticeModel> getList(int page){
		
		return getList(page, "TITLE", "");
	}

	@Override
	public List<NoticeModel> getList(){
		
		return getList(1, "TITLE", "");
	}

	@Override
	public int insert(Notice notice){
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		int result = noticeDao.insert(notice);
		
		return result;
	}

	@Override
	public int update(Notice notice){
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		int result = noticeDao.update(notice);
		
		return result;
	}

	@Override
	public int delete(String code){
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		int result = noticeDao.delete(code);
		
		return result;
	}

	@Override
	public int getCount(String field, String query) {
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		int count = noticeDao.getCount(field, query);
		
		return count;
	}

	@Override
	public String getlastCode() {
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		String code = noticeDao.getlastCode();
	
		return code;
	}

	@Override
	public Notice getPrev(String code) {
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		Notice notice = noticeDao.getPrev(code);
		
		return notice;
	}

	@Override
	public Notice getNext(String code) {
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		Notice notice = noticeDao.getNext(code);
		
		return notice;
	}

	@Override
	public int hitUp(String code) {
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		
		int result = noticeDao.hitUp(code);
		
		return result;
	}
}