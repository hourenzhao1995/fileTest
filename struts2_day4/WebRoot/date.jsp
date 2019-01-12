<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
  <%
  	ActionContext context=ActionContext.getContext();
    		ValueStack vs=context.getValueStack();
   %>
    日期:<s:property value="#request.date"/><br/>
    <s:date name="#request.date" format="yyyy-MM-dd"/><br/>
    
    <!-- 访问路径是一个Action -->
    <a href="<s:url namespace='day4' action='loginAction'/>">点击跳转</a>
  </body>
</html>
