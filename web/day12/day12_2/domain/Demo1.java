package cn.itcast.domain;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import cn.itcast.utils.CommonUtils;

public class Demo1 {
	@Test
	public void fun1() throws Exception {
		String className = "cn.itcast.domain.Person";
		Class clazz = Class.forName(className);
		Object bean = clazz.newInstance();
		
		BeanUtils.setProperty(bean, "name", "张三");
		BeanUtils.setProperty(bean, "age", "23");
		BeanUtils.setProperty(bean, "gender", "男");
		BeanUtils.setProperty(bean, "xxx", "XXX");
		
		String age = BeanUtils.getProperty(bean, "age");
		System.out.println(age);
		System.out.println(bean);
	}
	
	/*
	 * 把map中的属性直接封装到一个bean中　
	 * 
	 * Map: {"username":"zhangSan", "password","123"}
	 * 我们要把map的数据封装到一个javabean中！要求map的key与bean的属性名相同！
	 */
	@Test
	public void fun2() throws Exception {
		Map<String,String> map = new HashMap<String,String>();
		map.put("username", "zhangSan");
		map.put("password", "123");
		
		User user = new User();
		BeanUtils.populate(user, map);
		
		System.out.println(user);
	}
	
	@Test
	public void fun3() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("username", "zhangSan");
		map.put("password", "123");
		
		/*
		 * request.getParameterMap();
		 */
		
		User user = CommonUtils.toBean(map, User.class);
		System.out.println(user);
	}
}
