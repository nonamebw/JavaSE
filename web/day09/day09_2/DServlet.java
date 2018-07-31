package cn.itcast.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用ServletContext获取资源路径
 * @author cxf
 *
 */
public class DServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 它得到的是有盘符的路径：F:/xxx/xxx/xx/
		 * F:\JavaEE20140508\apache-tomcat-7.0.42\webapps\day09_2\index.jsp
		 */
		String path = this.getServletContext().getRealPath("/index.jsp");
		System.out.println(path);
		
		/*
		 * 获取资源的路径后，再创建出输入流对象！
		 */
		InputStream input = this.getServletContext().getResourceAsStream("/index.jsp");
		
		/*
		 * 获取当前路径下所有资源的路径！
		 */
		Set<String> paths = this.getServletContext().getResourcePaths("/WEB-INF");
		System.out.println(paths);
	}
}
