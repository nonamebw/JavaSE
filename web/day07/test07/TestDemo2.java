package cn.itcast.test07;

import java.util.Arrays;

/**
 * ʵ��һ�����ͷ����������������͵����飬�ߵ�����������Ԫ��
 * @author asus
 *
 */
public class TestDemo2 {

	public static void main(String[] args) {
		Integer[] arr1 = {10,12,13,14,20};
		System.out.println(Arrays.toString(arr1));
		//д����ʵ�ֵߵ�
		reverses(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("====================");
		
		String[] arr2 = {"aa","bb","cc","dd","ff"};
		System.out.println(Arrays.toString(arr2));
		reverses(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	
	public static <T> void reverses(T[] arr1) {
		/*
		 * ����˼�룺�ѵ�һ��Ԫ�غ����һ��Ԫ�ؽ���λ�ã��ѵڶ���Ԫ�غ͵����ڶ���Ԫ�ؽ���λ�á�������
		 * ���� ����/2
		 * */
		//��������
		for(int i=0;i<arr1.length/2;i++) {
			/*int temp = arr1[0];
			arr1[0] = arr1[arr1.length-1];*/
			T temp = arr1[i];
			arr1[i] = arr1[arr1.length-i-1];
			arr1[arr1.length-i-1] = temp;
		}
		
	}

	/*public static void reverses(Integer[] arr1) {
		
		 * ����˼�룺�ѵ�һ��Ԫ�غ����һ��Ԫ�ؽ���λ�ã��ѵڶ���Ԫ�غ͵����ڶ���Ԫ�ؽ���λ�á�������
		 * ���� ����/2
		 * 
		//��������
		for(int i=0;i<arr1.length/2;i++) {
			int temp = arr1[0];
			arr1[0] = arr1[arr1.length-1];
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length-i-1];
			arr1[arr1.length-i-1] = temp;
		}
		
	}*/

}
