package com.baizhi.lan;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

//拦截器
/*写一个类，实现接口
 * Interceptor
 * ai的作用:
 * 		1、影响请求轨迹，让请求通过拦截器:ai.invoke();
 * 		2、在拦截器中获取访问的目标Action对象:ai.getAction()
 * 		3、获取值栈对象:ai.getStack();
 * */
public class MyInter implements Interceptor{

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		System.out.println("Interceptor 执行-----");
		ai.invoke();//放请求通过继续执行   影响请求轨迹
		
		//中断请求
		return null;
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
