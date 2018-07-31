<h1>b.jsp</h1>

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	out.print(username + ", " + password);
%>
