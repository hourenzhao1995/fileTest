package com.baizhi.lan;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

//������
/*дһ���࣬ʵ�ֽӿ�
 * Interceptor
 * ai������:
 * 		1��Ӱ������켣��������ͨ��������:ai.invoke();
 * 		2�����������л�ȡ���ʵ�Ŀ��Action����:ai.getAction()
 * 		3����ȡֵջ����:ai.getStack();
 * */
public class MyInter implements Interceptor{

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		System.out.println("Interceptor ִ��-----");
		ai.invoke();//������ͨ������ִ��   Ӱ������켣
		
		//�ж�����
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
