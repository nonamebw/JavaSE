package cn.itcast.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示向Servletcontext中保存数据
 * @author cxf
 *
 */
public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 1. 获取ServletContext对象
		 * 2. 调用其setAttribute()方法完成保存数据
		 */
		ServletContext application = this.getServletContext();
		application.setAttribute("name", "张三");
	}
}
