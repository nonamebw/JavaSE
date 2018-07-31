<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<%
	pageContext.setAttribute("xxx", "pageContext_XXX");
	request.setAttribute("xxx", "request_XXX");
	session.setAttribute("xxx", "session_XXX");
	application.setAttribute("xxx", "application_XXX");
%>

${xxx }<br/>
${pageScope.xxx }<br/>
${requestScope.xxx }<br/>
${sessionScope.xxx }<br/>
${applicationScope.xxx }<br/>
  </body>
</html>


