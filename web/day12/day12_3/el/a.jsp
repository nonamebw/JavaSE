<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="cn.itcast.domain.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'a.jsp' starting page</title>
    
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
	Address address = new Address();
	address.setCity("北京");
	address.setStreet("西三旗");
	
	Employee emp = new Employee();
	emp.setName("李小四");
	emp.setSalary(123456);
	emp.setAddress(address);
	
	request.setAttribute("emp", emp);
%>

<h3>使用el获取request域的emp</h3>
${requestScope.emp.address.street }<!-- request.getAttribute("emp").getAddress().getStreet() --><br/>
${emp.hehe }
  </body>
</html>
