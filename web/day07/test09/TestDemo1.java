package cn.itcast.test09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestDemo1 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// 获取Class类
		Class clazz1 = Person.class;
		Class clazz2 = new Person().getClass();
		Class clazz3 = Class.forName("cn.itcast.test09.Person");

	}
	
	//操作普通方法 ，比如操作 setName
	@Test
	public void test4() throws Exception {
		//得到Class类
		Class c4 = Class.forName("cn.itcast.test09.Person");
		//得到Person实例
		Person p4 = (Person) c4.newInstance();
		//得到普通方法
		//c4.getDeclaredMethods();//得到所有的普通方法
		Method m1 = c4.getDeclaredMethod("setName", String.class);
		//操作的私有的方法 ，需要设置值是true
		//m1.setAccessible(true);
		//让setName方法执行 ，执行设置值
		m1.invoke(p4, "niuqi");
		System.out.println(p4.getName());
	}
	
	//操作name属性
	@Test
	public void test3() {
		try {
			//得到Class类
			Class c2 = Class.forName("cn.itcast.test09.Person");
			//得到name属性
			//c2.getDeclaredFields();//表示得到所有的属性
			//得到Person类的实例
			Person p11 = (Person) c2.newInstance();
			Field f1 = c2.getDeclaredField("name");
			//设置可以操作私有属性
			f1.setAccessible(true);
			//设置name值
			f1.set(p11, "wangwu"); //相当于 在 p.name = "wangwu";
			System.out.println(f1.get(p11)); //相当于 p.name
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//操作有参数的构造方法
	@Test
	public void test2() throws Exception {
		//得到Class
		Class c1 = Class.forName("cn.itcast.test09.Person");
		//使用有参数的构造方法
		//c1.getConstructors();//获取所有的构造方法
		//传递是有参数的构造方法里面参数类型，类型使用class形式传递
		Constructor cs = c1.getConstructor(String.class,String.class);
		//通过有参数的构造方法设置值
		//通过有参数的构造方法创建Person实例
		Person p1 = (Person) cs.newInstance("lisi","100");
		System.out.println(p1.getId()+" "+p1.getName());
	}
	
	//操作无参数的构造方法
	@Test
	public void test1() throws Exception {
		//得到Class
		Class c3 = Class.forName("cn.itcast.test09.Person");
		//得到Person类的实例
		Person p = (Person) c3.newInstance();
		//设置值
		p.setName("zhangsan");
		System.out.println(p.getName());
	}
	

}
