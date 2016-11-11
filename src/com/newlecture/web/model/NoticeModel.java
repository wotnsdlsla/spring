package com.newlecture.web.model;

import com.newlecture.web.entities.Notice;

public class NoticeModel extends Notice{
	private int cmtcnt;

	public int getCmtcnt() {
		return cmtcnt;
	}

	public void setCmtcnt(int cmtcnt) {
		this.cmtcnt = cmtcnt;
	}
}