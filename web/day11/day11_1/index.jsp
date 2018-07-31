<!-- 它是jsp指令，也是一种特殊的标签！ -->
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!-- java代码的片段 -->
<%
String path = request.getContextPath();//获取项目名
/*
http://localhost:8080/day11_1/
*/
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<!-- 向页面输出basePath -->
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
    This is my JSP page. <br>
    <%
    	int a = 10;
    %>
    
    <%
    	out.print(a++);
    %>
    <br/>
    <%=a %>
    <%!
    	int a = 100;
    	public void fun1() {
    		System.out.println(a);
    	}
    %>

    <%
    	out.print(this.a++);
    	fun1();
    %>
  </body>
</html>
