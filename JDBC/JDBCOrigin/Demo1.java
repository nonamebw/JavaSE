package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class Demo1 {
	/**
	 * ClassNotFoundException：
	 * > 没导驱动包
	 * > 
	 * 
	 * SQLException：
	 * > 检查3个参数：url、username、password是否正确
	 * > 检查是否开启了mysql服务器！
	 */
	@Test
	public void fun1() throws ClassNotFoundException, SQLException {
		/*
		 * jdbc四大配置参数：
		 * > driverClassName：com.mysql.jdbc.Driver
		 * > url：jdbc:mysql://localhost:3306/mydb3
		 * > username：root
		 * > password：123
		 */
		/*
		 * 所有的java.sql.Driver实现类，都提供了static块，块内的代码就是把自己注册到
		 * DriverManager中！
		 */
		/*
		 * jdbc4.0之后，每个驱动jar包中，在META-INF/services目录下提供了一个名为java.sql.Driver的文件。
		 * 文件的内容就是该接口的实现类名称！
		 */
		Class.forName("com.mysql.jdbc.Driver");// 加载驱动类(注册驱动)
//		com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
//		DriverManager.registerDriver(driver);
		// 使用url、username、password，得到连接对象
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb3", "root", "123");
		System.out.println(con);
	}
}
