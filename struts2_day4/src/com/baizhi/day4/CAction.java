package com.baizhi.day4;

import com.opensymphony.xwork2.Action;

public class CAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("CAction Ö´ÐÐ-----");
		return "cok";
	}

}
