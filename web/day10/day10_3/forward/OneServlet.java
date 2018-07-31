package cn.itcast.servlet.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示请求转发
 * @author cxf
 *
 */
public class OneServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("OneServlet...");
		response.setHeader("aaa", "AAA");//设置响应头
		
//		for(int i = 0; i < 1024 * 24 + 1; i++) {
//			response.getWriter().print("a");//设置响应体
//		}
		
		/*
		 * 向reuqest域中添加一个属性
		 */
		request.setAttribute("username", "zhangsan");
		
		// 等同与调用TwoServlet的service()方法。
		request.getRequestDispatcher("/TwoServlet").forward(request, response);//请求转发
		
	}
}
