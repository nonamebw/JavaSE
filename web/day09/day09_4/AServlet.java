package cn.itcast.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

/**
 * 演示获取类路径下的资源
 * @author cxf
 *
 */
public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 1. 得到ClassLoader
		 *   > 先得到Class，再得到ClassLoader
		 * 2. 调用其getResourceAsStream()，得到一个InputStream
		 */
//		ClassLoader cl = this.getClass().getClassLoader();
		// 相对/classes
//		InputStream input = cl.getResourceAsStream("cn/itcast/servlet/a.txt");
		
		Class c = this.getClass();
		// 相对当前.class文件所在目录！
//		InputStream input = c.getResourceAsStream("a.txt");
		
		// 相对classes下！
//		InputStream input = c.getResourceAsStream("/a.txt");
		
		InputStream input = c.getResourceAsStream("/../../index.jsp");
		
		String s = IOUtils.toString(input);//读取输入流内容，转换成字符串返回
		System.out.println(s);
	}

}
