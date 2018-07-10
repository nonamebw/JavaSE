package cn.itcast.demo4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import cn.itcast.demo3.JdbcUtils;


public class Demo4 {
	
	@Test
	public void fun1() throws Exception {
		
		Connection con = JdbcUtils.getConnection();
		String sql = "insert into mp3 values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, 1);
		pstmt.setString(2, "我很快乐.mp3");
	
		byte[] bytes = IOUtils.toByteArray(new FileInputStream("F:/我很快乐.mp3"));
		
		Blob blob = new SerialBlob(bytes);
		
		pstmt.setBlob(3, blob);
		
		pstmt.executeUpdate();
	}
	
	
	@Test
	public void fun2() throws Exception {
		
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from mp3";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		
		ResultSet rs = pstmt.executeQuery();
		
		
		if(rs.next()) {
			Blob blob = rs.getBlob("data");
			
			InputStream in = blob.getBinaryStream();
			OutputStream out = new FileOutputStream("E:/whkl.mp3");
			IOUtils.copy(in, out);
		}
	}
}
