package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示ServletContext获取公共的初始化参数
 * @author cxf
 *
 */
public class CServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 1. 得到ServletContext
		 * 2. 调用它getInitParameter(String)得到初始化参数
		 */
		ServletContext app = this.getServletContext();
		String value = app.getInitParameter("context-param");
		System.out.println(value);
	}

}
