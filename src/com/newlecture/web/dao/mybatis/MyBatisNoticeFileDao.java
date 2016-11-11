package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.newlecture.web.dao.NoticeFileDao;
import com.newlecture.web.entities.NoticeFile;

public class MyBatisNoticeFileDao implements NoticeFileDao{
	private SqlSession sqlSession;
	
	public void setsqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<NoticeFile> getList(String noticeCode) {
		NoticeFileDao noticeFileDao = sqlSession.getMapper(NoticeFileDao.class);
		
		List<NoticeFile> list = noticeFileDao.getList(noticeCode);
		
		return list;
	}

	@Override
	public int insert(NoticeFile file) {
		NoticeFileDao noticeFileDao = sqlSession.getMapper(NoticeFileDao.class);
		
		int result = noticeFileDao.insert(file);
		
		return result;
	}

	@Override
	public int update(NoticeFile file) {
		NoticeFileDao noticeFileDao = sqlSession.getMapper(NoticeFileDao.class);
		
		int result = noticeFileDao.update(file);
		
		return result;
	}

	@Override
	public int delete(String code) {
		NoticeFileDao noticeFileDao = sqlSession.getMapper(NoticeFileDao.class);
		
		int result = noticeFileDao.delete(code);
		
		return result;
	}
}