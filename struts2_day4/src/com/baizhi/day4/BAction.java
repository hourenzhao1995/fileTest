package com.baizhi.day4;

import com.opensymphony.xwork2.Action;

public class BAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("BAction Ö´ÐÐ-----");
		return "bok";
	}

}
