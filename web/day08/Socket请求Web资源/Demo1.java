package cn.itcast;

import java.io.PrintStream;
import java.net.Socket;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * Socket发送请求，访问Web资源
 * @author Administrator
 *
 */
public class Demo1 {
	/**
	 * 发送GET请求
	 */
	@Test
	public void fun1() throws Exception {
		Socket socket = new Socket("localhost", 8080);
		PrintStream out = new PrintStream(socket.getOutputStream());
		
		StringBuilder sb = new StringBuilder();
		sb.append("GET /day03_1/index2.jsp?username=zhangSan HTTP/1.1").append("\r\n");//请求行
		sb.append("Host: localhost:8080").append("\r\n");//请求主机
		sb.append("Connection: close").append("\r\n");//连接方式是马上断开
		sb.append("\r\n");//空行，因为GET没有请求体，所以请求内容最后是空行
		
		out.print(sb.toString());
		
		//////////////////////////////////////
		
		String s = IOUtils.toString(socket.getInputStream());
		System.out.println(s);
	}
	
	/**
	 * 发送POST请求
	 */
	@Test
	public void fun2() throws Exception {
		Socket socket = new Socket("localhost", 8080);
		PrintStream out = new PrintStream(socket.getOutputStream());
		
		StringBuilder sb = new StringBuilder();
		sb.append("POST /day03_1/index2.jsp HTTP/1.1").append("\r\n");//请求行
		sb.append("Host: localhost:8080").append("\r\n");//请求主机
		sb.append("Content-Type: application/x-www-form-urlencoded").append("\r\n");
		sb.append("Content-Length: 17").append("\r\n");
		sb.append("Connection: close").append("\r\n");//连接方式是马上断开
		sb.append("\r\n");//空行，因为GET没有请求体，所以请求内容最后是空行
		sb.append("username=zhangSan");
		
		out.print(sb.toString());
		
		//////////////////////////////////////
		
		String s = IOUtils.toString(socket.getInputStream());
		System.out.println(s);		
	}
}
