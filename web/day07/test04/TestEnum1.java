package cn.itcast.test04;

public class TestEnum1 {
	//传统的方式
	private int color;
	
	//第二种方式
	private Color2 color1;
	
	//第三种方式 jdk5.0新特性 使用枚举
	private Color3 color3;
	
	public void test() {
		this.color = 1000;//Color1.RED;
		this.color1 = Color2.RED;
		this.color3 = Color3.GREEN;
	}
}

//使用枚举实现
enum Color3 {
	RED,GREEN,YELLOW;
}

class Color2 {
	//构造方法私有化
	private Color2(String name){}
	public static final Color2 RED = new Color2("");
	public static final Color2 GREEN = new Color2("");
	public static final Color2 YELLOW = new Color2("");
}

class Color1 {
	public static final int RED = 1;
	public static final int GREEN = 2;
	public static final int YELLOW = 3;
}
