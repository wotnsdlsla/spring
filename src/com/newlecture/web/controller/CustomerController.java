package com.newlecture.web.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.dao.NoticeFileDao;
import com.newlecture.web.dao.mybatis.MyBatisNoticeDao;
import com.newlecture.web.dao.mybatis.MyBatisNoticeFileDao;
import com.newlecture.web.entities.Notice;
import com.newlecture.web.entities.NoticeFile;
import com.newlecture.web.model.NoticeModel;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
@RequestMapping("/customer/*") /*집중화*/
public class CustomerController {
	
	@Autowired
	private NoticeDao noticeDao;
	@Autowired
	private NoticeFileDao noticeFileDao;
	
	 public CustomerController() {
		//noticeDao = new MyBatisNoticeDao();
		//noticeFileDao = new MyBatisNoticeFileDao();
		
	}
	
	@RequestMapping("notice")
	public String notice(Integer p, String t, String q, Model model) {
	
		int page = 1;
		String field = "TITLE";
		String query = "";

		if (p != null && p != 0)
			page = p;

		if (t != null && !t.equals(""))
			field = t;

		if (q != null)
			query = q;

		//NoticeDao noticeDao = new MyBatisNoticeDao();
		List<NoticeModel> list = noticeDao.getList(page, field, query);
		int count = noticeDao.getCount(field, query);

		model.addAttribute("list", list);
		model.addAttribute("count", count);

		System.out.println(t);
		System.out.println(q);
		
		return "customer.notice";
		//return "/WEB-INF/views/customer/notice.jsp";
	}

	@RequestMapping("notice-detail")
	public String noticeDetail(String code, Model model) {

		//NoticeDao noticeDao = new MyBatisNoticeDao();
		//NoticeFileDao noticeFileDao = new MyBatisNoticeFileDao();

		Notice notice;
		Notice prev;
		Notice next;

		noticeDao.hitUp(code);
		List<NoticeFile> noticeFiles;

		notice = noticeDao.get(code);
		prev = noticeDao.getPrev(code);
		next = noticeDao.getNext(code);
		noticeFiles = noticeFileDao.getList(code);

		model.addAttribute("n", notice);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		model.addAttribute("files", noticeFiles);

		//return "/WEB-INF/views/customer/notice-detail.jsp";
		return "customer.notice-detail";

	}
	@RequestMapping(value="notice-reg",method=RequestMethod.GET)
	public String noticeReg() {
		
		return "customer.notice-reg";
	}
	
	@RequestMapping(value="notice-reg",method=RequestMethod.POST)
	public String noticeReg(Notice notice) {
	
		//System.out.println();
		notice.setWriter("쿠앙쿠앙");
		noticeDao.insert(notice);
		
		return "redirect:notice";
	}
	
	@RequestMapping("notice-edit")
	public String noticeEdit() {
		
		return "customer.notice-edit";

	}

}
