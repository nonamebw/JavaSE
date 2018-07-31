package cn.itcast.servlet.include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("OneServlet...");
		response.setHeader("aaa", "AAA");//设置响应头
		
		response.getWriter().print("aaaa");//设置响应体
		request.getRequestDispatcher("/TwoServlet").include(request, response);//请求转发
	}
}
