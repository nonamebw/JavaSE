package cn.itcast.test04;

public class TestEnum1 {
	//��ͳ�ķ�ʽ
	private int color;
	
	//�ڶ��ַ�ʽ
	private Color2 color1;
	
	//�����ַ�ʽ jdk5.0������ ʹ��ö��
	private Color3 color3;
	
	public void test() {
		this.color = 1000;//Color1.RED;
		this.color1 = Color2.RED;
		this.color3 = Color3.GREEN;
	}
}

//ʹ��ö��ʵ��
enum Color3 {
	RED,GREEN,YELLOW;
}

class Color2 {
	//���췽��˽�л�
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
