package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 1. 先获取来使用iso的错误字符串
		 * 2. （iso）回退，（使用utf-8）重编
		 */
		String name = request.getParameter("username");
		byte[] b = name.getBytes("iso-8859-1");
		name = new String(b, "utf-8");
		
		System.out.println(name);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/*
		 * 1. 在获取参数之前，需要先调用request.setCharacterEncoding("utf-8");
		 * 2. 使用getParameter()来获取参数
		 */
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		System.out.println(username);
	}
}
