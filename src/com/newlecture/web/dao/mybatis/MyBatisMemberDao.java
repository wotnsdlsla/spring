package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.newlecture.web.dao.MemberDao;
import com.newlecture.web.entities.Member;

public class MyBatisMemberDao implements MemberDao{
private SqlSession sqlSession;
	
	public void setsqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	      
	   
	   @Override
	   public Member get(String mid) {
	      MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
	      
	      Member member = memberDao.get(mid);
	      
	      
	      return member;
	   }

	   @Override
	   public List<Member> getList(int page, String field, String query) {
	      MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
	      return memberDao.getList(page, field, query);
	   }

	   @Override
	   public int insert(Member member) {
	      MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
	      
	      int result = memberDao.insert(member);
	      
	      return result;
	   }

	   @Override
	   public int update(Member member) {
	      MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
	      
	      int result = memberDao.update(member);
	      
	      return result;
	   }

	   @Override
	   public int delete(String mid) {
	      MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
	      
	      int result = memberDao.delete(mid);
	      
	      return result;
	   }
}