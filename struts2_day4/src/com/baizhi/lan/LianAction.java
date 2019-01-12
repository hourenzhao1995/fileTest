package com.baizhi.lan;

import com.opensymphony.xwork2.Action;

public class LianAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("LianAction------");
		return "aa";
	}

}
