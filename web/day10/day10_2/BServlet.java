package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 使用Referer请求头，来防盗链
		 */
		String referer = request.getHeader("Referer");
		System.out.println(referer);
		if(referer == null || !referer.contains("localhost")) {
			response.sendRedirect("http://www.baidu.com");
		} else {
			System.out.println("hello!");
		}
	}
}
