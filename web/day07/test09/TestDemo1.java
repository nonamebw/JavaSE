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
		// ��ȡClass��
		Class clazz1 = Person.class;
		Class clazz2 = new Person().getClass();
		Class clazz3 = Class.forName("cn.itcast.test09.Person");

	}
	
	//������ͨ���� ��������� setName
	@Test
	public void test4() throws Exception {
		//�õ�Class��
		Class c4 = Class.forName("cn.itcast.test09.Person");
		//�õ�Personʵ��
		Person p4 = (Person) c4.newInstance();
		//�õ���ͨ����
		//c4.getDeclaredMethods();//�õ����е���ͨ����
		Method m1 = c4.getDeclaredMethod("setName", String.class);
		//������˽�еķ��� ����Ҫ����ֵ��true
		//m1.setAccessible(true);
		//��setName����ִ�� ��ִ������ֵ
		m1.invoke(p4, "niuqi");
		System.out.println(p4.getName());
	}
	
	//����name����
	@Test
	public void test3() {
		try {
			//�õ�Class��
			Class c2 = Class.forName("cn.itcast.test09.Person");
			//�õ�name����
			//c2.getDeclaredFields();//��ʾ�õ����е�����
			//�õ�Person���ʵ��
			Person p11 = (Person) c2.newInstance();
			Field f1 = c2.getDeclaredField("name");
			//���ÿ��Բ���˽������
			f1.setAccessible(true);
			//����nameֵ
			f1.set(p11, "wangwu"); //�൱�� �� p.name = "wangwu";
			System.out.println(f1.get(p11)); //�൱�� p.name
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//�����в����Ĺ��췽��
	@Test
	public void test2() throws Exception {
		//�õ�Class
		Class c1 = Class.forName("cn.itcast.test09.Person");
		//ʹ���в����Ĺ��췽��
		//c1.getConstructors();//��ȡ���еĹ��췽��
		//�������в����Ĺ��췽������������ͣ�����ʹ��class��ʽ����
		Constructor cs = c1.getConstructor(String.class,String.class);
		//ͨ���в����Ĺ��췽������ֵ
		//ͨ���в����Ĺ��췽������Personʵ��
		Person p1 = (Person) cs.newInstance("lisi","100");
		System.out.println(p1.getId()+" "+p1.getName());
	}
	
	//�����޲����Ĺ��췽��
	@Test
	public void test1() throws Exception {
		//�õ�Class
		Class c3 = Class.forName("cn.itcast.test09.Person");
		//�õ�Person���ʵ��
		Person p = (Person) c3.newInstance();
		//����ֵ
		p.setName("zhangsan");
		System.out.println(p.getName());
	}
	

}
