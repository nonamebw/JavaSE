package cn.itcast.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Demo2 {
	/*
	 * 连接数据库，得到Connection就算成功！
	 * 对数据库做增、删、改
	 */
	@Test
	public void fun1() throws ClassNotFoundException, SQLException {
		/*
		 * 一、得到Connection
		 * 1. 准备四大参数
		 * 2. 加载驱动类
		 * 3. 得到Connection
		 */
		// 准备四大参数
		String driverClassName = "com.mysql.jdbc.Driver";
		// jdbc协议的格式！jdbc:工商的名称:子协议（由工商自己来规定）
		// 对mysql而言，它的子协议结构：//主机:端口号/数据库名称
		String url = "jdbc:mysql://localhost:3306/mydb3";
		String username = "root";
		String password = "123";
		
		// 加载驱动类
		Class.forName(driverClassName);
		// 使用DriverManager，以及省下的3个参数，得到Connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		/*
		 * 二、对数据库做增、删、改
		 * 1. 通过Connection对象创建Statement
		 * > Statement语句的发送器，它的功能就是向数据库发送sql语句！
		 * 2. 调用它的int executeUpdate(String sql)，它可以发送DML、DDL
		 */
		// 1. 通过Connection得到Statement对象
		Statement stmt = con.createStatement();
		// 2. 使用Statement发送sql语句！
//		String sql = "INSERT INTO stu VALUES('ITCAST_0003', 'wangWu', 88, 'male')";
//		String sql = "UPDATE stu SET name='zhaoLiu', age=22, " +
//				"gender='female' WHERE number='ITCAST_0003'";
		String sql = "DELETE FROM stu";
		int r = stmt.executeUpdate(sql);
		System.out.println(r);
	}
	
	/**
	 * 执行查询
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	@Test
	public void fun2() throws ClassNotFoundException, SQLException {
		/*
		 * 一、得到Connection
		 * 二、得到Statement，发送select语句
		 * 三、对查询返回的“表格”进行解析！
		 */
		/*
		 * 一、得到连接
		 * 1. 准备四大连接参数
		 */
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/exam";
		String username = "root";
		String password = "123";
		
		/*
		 * 2. 加载驱动类
		 */
		Class.forName(driverClassName);
		/*
		 * 3. 通过省下的三个参数调用DriverManger的getConnection()，得到连接
		 */
		Connection con = DriverManager.getConnection(url, username, password);
		
		/*
		 * 二、得到Statement，执行select语句
		 * 1. 得到Statement对象：Connection的createStatement()方法
		 */
		Statement stmt = con.createStatement();
		/*
		 * 2. 调用Statement的ResultSet rs = executeQuery(String querySql)
		 */
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		/*
		 * 三、解析ResultSet
		 * 1. 把行光标移动到第一行，可以调用next()方法完成！
		 */
		while(rs.next()) {//把光标向下移动一行，并判断下一行是否存在！
			int empno = rs.getInt(1);//通过列编号来获取该列的值！
			String ename = rs.getString("ename");//通过列名称来获取该列的值
			double sal = rs.getDouble("sal");
			
			System.out.println(empno +  ", " + ename + ", " + sal);
		}
		
		/*
		 * 四、关闭资源
		 * 倒关
		 */
		rs.close();
		stmt.close();
		con.close();//这个东东，必须要关，不关就死！
	}
	
	// 规范化
	@Test
	public void fun3() throws Exception {
		Connection con = null;//定义引用
		Statement stmt = null;
		ResultSet rs = null;
		try {
			/*
			 * 一、得到连接
			 */
			String driverClassName = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/exam";
			String username = "root";
			String password = "123";
			
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, username, password);//实例化
			
			/*
			 * 二、创建Statement
			 */
			stmt = con.createStatement();
			String sql = "select * from emp";
			rs = stmt.executeQuery(sql);
			
			rs.last();//把光标移动到最后一行
System.out.println(rs.getRow());
			rs.beforeFirst();
			
			/*
			 * 三、循环遍历rs，打印其中数据
			 * 
			 * getString()和getObject()是通用的！
			 */
//			while(rs.next()) {
//				System.out.println(rs.getObject(1) + ", " 
//						+ rs.getString("ename") + ", " + rs.getDouble("sal"));
//			}
			
			int count = rs.getMetaData().getColumnCount();
			while(rs.next()) {//遍历行
				for(int i = 1; i <= count; i++) {//遍历列
					System.out.print(rs.getString(i));
					if(i < count) {
						System.out.print(", ");
					}
				}
				System.out.println();
			}
			
		} catch(Exception e) {
			throw new RuntimeException(e);
		} finally {
			// 关闭
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}
		
	}
}
