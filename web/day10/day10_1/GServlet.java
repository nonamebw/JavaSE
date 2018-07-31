package cn.itcast.servlet;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class GServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
/*
		String s = "Hello outputStream";
		byte[] bytes = s.getBytes();
		response.getOutputStream().write(bytes);
*/
		/**
		 * 演示响应字节数据
		 */
		// 把一张图片读取到字节数组中
		String path = "F:/F/白冰.jpg";
		FileInputStream in = new FileInputStream(path);
//		byte[] bytes = IOUtils.toByteArray(in);//读取输入流内容的字节到字节数组中。
//		response.getOutputStream().write(bytes);
		IOUtils.copy(in, response.getOutputStream());
	}
}
