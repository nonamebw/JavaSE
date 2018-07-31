package cn.itcast.servlet;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * 演示ClassLoader和Class获取类路径资源
 * @author cxf
 *
 */
public class Demo2 {
	/*
	 * 说ClassLoader获取资源时，不能以“/”开头！
	 */
	@Test
	public void fun1() throws IOException {
		ClassLoader cl = Demo2.class.getClassLoader();//得到类加载器
		InputStream in = cl.getResourceAsStream("a.html");//让类加载器去类路径下查找资源　
		System.out.println(IOUtils.toString(in));
	}
	
	/*
	 * 使用class来加载类路径下的资源1
	 */
	@Test
	public void fun2() throws IOException {
		Class c = Demo2.class;
		InputStream in = c.getResourceAsStream("/a.html");//与类加载器的效果相同
		System.out.println(IOUtils.toString(in));
	}
	
	/*
	 * 使用class来加载类路径下的资源2
	 */
	@Test
	public void fun3() throws IOException {
		Class c = Demo2.class;
		InputStream in = c.getResourceAsStream("a.html");//到当前Class对应的.class文件所在目录去加载
		System.out.println(IOUtils.toString(in));
	}
}
