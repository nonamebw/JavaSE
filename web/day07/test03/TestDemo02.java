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
 * �����ڼ����ϵ�ʹ��
 * @author asus
 *
 */
public class TestDemo02 {

	//��map��ʹ�÷���
	@Test
	public void testMap() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");
		//����map �м��ֱ�����ʽ ����
		// 1����ȡ���е�key��ͨ��key�õ�value ʹ��get����
		// 2����ȡkey��value�Ĺ�ϵ
		//ʹ�õ�һ�ַ�ʽ����
		//��ȡ���е�key
		Set<String> sets = map.keySet();
		//��������key���ص�set
		for (String key : sets) {
			//ͨ��key�õ�value
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
		System.out.println("==============");
		//�õ�key��value�Ĺ�ϵ
		Set<Entry<String, String>> sets1 = map.entrySet();
		//����sets1
		for (Entry<String, String> entry : sets1) {
			//entry��key��value��ϵ
			String keyv = entry.getKey();
			String valuev = entry.getValue();
			System.out.println(keyv+" : "+valuev);
		}
	}
	
	//����ʹ��set������
	@Test
	public void testSet() {
		Set<String> set = new HashSet<String>();
		set.add("www");
		set.add("qqq");
		set.add("zzz");
		//set.add("qqq");
		//����set �м��ַ�ʽ  ����
		//������  ��ǿfor
		//ʹ����ǿfor����
		for (String s2 : set) {
			System.out.println(s2);
		}
		System.out.println("=================");
		//ʹ�õ���������
		Iterator<String> it1 = set.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
	
	//������list�ϵ�ʹ��
	@Test
	public void testList() {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//����list���� �м��ַ�ʽ  ����
		//��ͨforѭ��  ������  ��ǿfor
		//��ͨforѭ��
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("=================");
		//ʹ����ǿfor
		for (String s1 : list) {
			System.out.println(s1);
		}
		System.out.println("=================");
		//ʹ�õ���������
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}








