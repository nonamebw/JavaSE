<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="it" uri="/WEB-INF/tlds/itcast-tag.tld" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
<it:myTag5 test="${empty param.xxx }">
  <h1><it:myTag4/></h1>
</it:myTag5>

<h1><it:myTag1/></h1>
<h2><it:myTag2/></h2>
<hr/>
<%
request.setAttribute("xxx", "zhangSan");
%>
<h3>
<it:myTag3>${xxx }</it:myTag3>
</h3>
<h3>
<it:myTag3>我是张三的大哥</it:myTag3>
</h3>
  </body>
</html>
