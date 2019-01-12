package com.s;

import com.opensymphony.xwork2.Action;

public class login implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("login Ö´ÐÐ");
		return "ok";
	}

}
