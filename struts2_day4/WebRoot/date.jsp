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
    ����:<s:property value="#request.date"/><br/>
    <s:date name="#request.date" format="yyyy-MM-dd"/><br/>
    
    <!-- ����·����һ��Action -->
    <a href="<s:url namespace='day4' action='loginAction'/>">�����ת</a>
  </body>
</html>
