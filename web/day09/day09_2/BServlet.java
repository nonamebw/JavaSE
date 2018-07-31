package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示从ServletContext中获取数据
 */
public class BServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 1. 获取ServletContext对象
		 * 2. 调用其getAttribute()方法完成获取数据
		 */
		ServletContext application = this.getServletContext();
		String name = (String)application.getAttribute("name");
		System.out.println(name);
	}
}
