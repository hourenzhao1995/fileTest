<%@page contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
  
  <body>
    <div>
    	<s:action name="a" executeResult="true"></s:action>
    <hr color="red"/>
    </div>
    <div>
    	<s:action name="b" executeResult="true"></s:action>
    	<hr color="blue"/>
    </div>
    <div>
    	<s:action name="c" executeResult="true"></s:action>
    	<hr color="red"/>
    </div>
  </body>
</html>
