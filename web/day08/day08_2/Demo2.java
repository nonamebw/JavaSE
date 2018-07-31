package cn.itcast;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

import cn.itcast.vcode.utils.VerifyCode;

public class Demo2 {
	@Test
	public void fun1() throws FileNotFoundException, IOException {
		VerifyCode verifyCode = new VerifyCode();
		BufferedImage bi = verifyCode.getImage();//随机的！
		System.out.println(verifyCode.getText());//打印图片上的文本内容
		
		VerifyCode.output(bi, new FileOutputStream("F:/b.jpg"));
	}
}
