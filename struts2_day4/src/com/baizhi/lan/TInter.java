package com.baizhi.lan;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TInter implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("t������ ִ��");
		
		//�ж����󣬺���ת��λ��
		return "zd";
	}

}
