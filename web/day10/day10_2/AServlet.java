package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示：获取客户端的IP地址、获取请求方式、获取User-Agent，得到客户端的信息(操作系统 浏览器)。
 * @author cxf
 *
 */
public class AServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String addr = request.getRemoteAddr();//获取客户端的IP地址
		
		response.sendRedirect("http://www.baidu.com");
		if(true) return;
		
//		System.out.println("IP: " + addr);
//		System.out.println("请求方式：" + request.getMethod());//获取请求方式
		String userAgent = request.getHeader("User-Agent");//获取名为User-Agent的请求头！
		/*
		 * Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.72 Safari/537.36
		 */
		// 是否包含Chrome，如果包含，说明用户使用的是google浏览器
		if(userAgent.toLowerCase().contains("chrome")) {
			System.out.println("您好：" + addr + ", 你用的是谷歌");
		} else if(userAgent.toLowerCase().contains("firefox")) {
			System.out.println("您好：" + addr + ", 你用的是火狐");
		} else if(userAgent.toLowerCase().contains("msie")) {
			System.out.println("您好：" + addr + ", 你用的是IE");
		}
	}
}
