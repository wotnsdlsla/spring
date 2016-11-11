package com.newlecture.web.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entities.Notice;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String src = "com/newlec/web/dao/mybatis/config.xml"; //"config.xml";(�䷸�� �ص� �ȴ�~~)
		InputStream is = Resources.getResourceAsStream(src);
		
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
/***********************************************************************************************************/		
		SqlSession session = ssf.openSession();
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		Notice n = noticeDao.get("981");
		
		System.out.println(n.getTitle());
	}
}