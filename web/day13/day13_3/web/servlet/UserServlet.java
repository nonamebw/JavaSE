package cn.itcast.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.domain.User;

import cn.itcast.service.UserService;

public class UserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 在servlet中依赖service，然后通过service完成功能，把结果保存到request中
		 * 转发到jsp显示。
		 */
		UserService userService = new UserService();
		User user = userService.find();
		
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("/show.jsp").forward(request, response);
	}
}
