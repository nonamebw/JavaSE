package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示定时刷新
 * @author cxf
 * 
 * 设置一个Refresh，它表示定时刷新！
 */
public class DServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 下面是用来发送响应体！
		 */
		PrintWriter writer = response.getWriter();
		writer.print("欢迎XXX登录！5秒钟后会自动跳转到主页！您看到的一定是乱码！");
		/*
		 * 设置名为Refresh的响应头
		 */
		response.setHeader("Refresh", "5;URL=/day10_1/EServlet");
	}
}
