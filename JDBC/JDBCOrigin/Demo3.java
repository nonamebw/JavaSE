package cn.itcast.demo3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * PreapredStatement
 * 防SQL攻击
 * @author cxf
 *
 */
public class Demo3 {
	/**
	 * 登录
	 * 使用username和password去查询数据
	 * 若查出结果集，说明正确！返回true
	 * 若查出不出结果，说明用户名或密码错误，返回false
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception 
	 */
	public boolean login(String username, String password) throws Exception {
		/*
		 * 一、得到Connection
		 * 二、得到Statement
		 * 三、得到ResultSet
		 * 四、rs.next()返回的是什么，我们就返回什么
		 */
		// 准备四大参数
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb3";
		String mysqlUsername = "root";
		String mysqlPassword = "123";
		// 加载驱动类
		Class.forName(driverClassName);
		// 得到Connection
		Connection con = DriverManager.getConnection(url, mysqlUsername, mysqlPassword);
		
		// 得到Statement
		Statement stmt = con.createStatement();
		
		// 给出sql语句，调用stmt的executeQuery()，得到ResultSet
		String sql = "select * from t_user where username='" + username + "' and password='" + password + "'";
System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		
		return rs.next();
	}
	
	/**
	 * SQL攻击!
	 * @throws Exception
	 */
	@Test
	public void fun1() throws Exception {
		//select * from t_user where username='a' or 'a'='a' and password='a' or 'a'='a'
		String username = "a' or 'a'='a";
		String password = "a' or 'a'='a";
		boolean bool = login(username, password);
		System.out.println(bool);
	}
	
	public boolean login2(String username, String password) throws Exception {
		/*
		 * 一、得到Connection
		 * 二、得到Statement
		 * 三、得到ResultSet
		 * 四、rs.next()返回的是什么，我们就返回什么
		 */
		// 准备四大参数
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb3?useServerPrepStmts=true&cachePrepStmts=true";
		String mysqlUsername = "root";
		String mysqlPassword = "123";
		// 加载驱动类
		Class.forName(driverClassName);
		// 得到Connection
		Connection con = DriverManager.getConnection(url, mysqlUsername, mysqlPassword);
		
		///////////////////////////////////////
		///////////////////////////////////////
		
		
		/*
		 * 一、得到PreparedStatement
		 * 1. 给出sql模板：所有的参数使用?来替代
		 * 2. 调用Connection方法，得到PreparedStatement
		 */
		String sql = "select * from t_user where username=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		/*
		 * 二、为参数赋值
		 */
		pstmt.setString(1, username);//给第1个问号赋值，值为username
		pstmt.setString(2, password);//给第2个问号赋值，值为password
		
		ResultSet rs = pstmt.executeQuery();//调用查询方法，向数据库发送查询语句
		
		pstmt.setString(1, "liSi");
		pstmt.setString(2, "123");
		
		pstmt.executeQuery();
		
		
		return rs.next();
	}
	
	@Test
	public void fun2() throws Exception {
		//select * from t_user where username='a' or 'a'='a' and password='a' or 'a'='a'
		String username = "zhangSan";
		String password = "123";
		boolean bool = login2(username, password);
		System.out.println(bool);
	}
	
	/**
	 * 测试JdbcUtils.getConnection()
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	@Test
	public void fun3() throws SQLException {
		Connection con = JdbcUtils.getConnection();
		System.out.println(con);
		Connection con1 = JdbcUtils.getConnection();
		System.out.println(con1);
	}
}
