package com.baizhi.day4;

import com.opensymphony.xwork2.Action;

public class AAction implements Action{

	@Override
	public String execute() throws Exception {
		
		System.out.println("AAction Ö´ÐÐ---");
		return "aok";
	}

}
