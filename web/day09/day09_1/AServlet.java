package cn.itcast.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 查看Servlet接口中的方法
 */
public class AServlet implements Servlet {
	/*
	 * 它也是生命周期方法
	 * 它会在Servlet被销毁之前调用，并且它只会被调用一次！
	 */
	@Override
	public void destroy() {
		System.out.println("destory()...");
	}

	/*
	 * 可以用来获取Servlet的配置信息
	 */
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()...");
		return null;
	}

	/*
	 * 获取Servlet的信息
	 */
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()...");
		return "我是一个快乐的Servlet";
	}

	/*
	 * 它是生命周期方法
	 * 它会在Servlet对象创建之后马上执行，并只执行一次！（出生之后）
	 * 
	 */
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init()...");
		
		/*
		 * 获取初始化参数
		 */
		System.out.println(servletConfig.getInitParameter("p1"));
		System.out.println(servletConfig.getInitParameter("p2"));
		
		/*
		 * 获取所有初始化参数的名称
		 */
		Enumeration e = servletConfig.getInitParameterNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

	/*
	 * 它是生命周期方法
	 * 它会被调用多次！！！
	 * 每次处理请求都是在调用这个方法！
	 */
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("service()...");
	}
}
