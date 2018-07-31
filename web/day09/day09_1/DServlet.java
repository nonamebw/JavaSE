package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DServlet extends GenericServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("哈哈哈～我来也！");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("hello world");
	}

	@Override
	public void destroy() {
		System.out.println("destory()");
	}
}
