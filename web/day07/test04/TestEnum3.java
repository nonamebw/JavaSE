package cn.itcast.test04;

import org.junit.Test;

public class TestEnum3 {
	
	//知道枚举的下标，得到枚举的对象和名称
	@Test
	public void test3() {
		int idx2 = 2;
		//得到枚举的对象
		Color100[] cs = Color100.values();
		//根据下标得到对象
		Color100 c12 = cs[idx2];
		//得到枚举的名称
		String name = c12.name();
		System.out.println(name);
	}
	
	//知道枚举的名称，得到枚举的对象和下标
	@Test
	public void test2() {
		String name1 = "GREEN";
		//得到对象
		Color100 c1 = Color100.valueOf(name1);
		//枚举下标
		int idx1 = c1.ordinal();
		System.out.println(idx1);
	}

	//知道枚举的对象，得到枚举名称和下标
	@Test
	public void test1() {
		//得到枚举对象
		Color100 c100 = Color100.RED;
		//枚举名称
		String name = c100.name();
		//枚举的下标
		int idx = c100.ordinal();
		System.out.println(name+" "+idx);
	}
}

enum Color100 {
	RED,GREEN,YELLOW;
}
