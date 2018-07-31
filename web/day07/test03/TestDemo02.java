package cn.itcast.test03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * 泛型在集合上的使用
 * @author asus
 *
 */
public class TestDemo02 {

	//在map上使用泛型
	@Test
	public void testMap() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");
		//遍历map 有几种遍历方式 两种
		// 1、获取所有的key，通过key得到value 使用get方法
		// 2、获取key和value的关系
		//使用第一种方式遍历
		//获取所有的key
		Set<String> sets = map.keySet();
		//遍历所有key返回的set
		for (String key : sets) {
			//通过key得到value
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
		System.out.println("==============");
		//得到key和value的关系
		Set<Entry<String, String>> sets1 = map.entrySet();
		//遍历sets1
		for (Entry<String, String> entry : sets1) {
			//entry是key和value关系
			String keyv = entry.getKey();
			String valuev = entry.getValue();
			System.out.println(keyv+" : "+valuev);
		}
	}
	
	//泛型使用set集合上
	@Test
	public void testSet() {
		Set<String> set = new HashSet<String>();
		set.add("www");
		set.add("qqq");
		set.add("zzz");
		//set.add("qqq");
		//遍历set 有几种方式  两种
		//迭代器  增强for
		//使用增强for遍历
		for (String s2 : set) {
			System.out.println(s2);
		}
		System.out.println("=================");
		//使用迭代器遍历
		Iterator<String> it1 = set.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
	
	//泛型在list上的使用
	@Test
	public void testList() {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//遍历list集合 有几种方式  三种
		//普通for循环  迭代器  增强for
		//普通for循环
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("=================");
		//使用增强for
		for (String s1 : list) {
			System.out.println(s1);
		}
		System.out.println("=================");
		//使用迭代器遍历
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}








