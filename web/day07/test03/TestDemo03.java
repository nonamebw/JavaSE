package cn.itcast.test03;

import java.util.Arrays;

/**
 * ����һ�����飬ʵ��ָ��λ��������Ԫ�صĽ���
 * @author asus
 *
 */
public class TestDemo03 {

	public static void main(String[] args) {
		//����һ������ ʵ��11��13λ�ý���
		Integer[] arr1 = {10,11,12,13,14};
		System.out.println(Arrays.toString(arr1));
		swap1(arr1,1,3);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("=========================");
		//����һ��string���͵����� ʵ�� bb��ddλ�ý���
		String[] arr2 = {"aa","bb","cc","dd","ff"};
		System.out.println(Arrays.toString(arr2));
		swap1(arr2,1,3);
		System.out.println(Arrays.toString(arr2));

	}
	
	/*
	 * ʹ�÷��ͷ��� ��Ҫ����һ������ ʹ�ô�д��ĸ��ʾ T :���T��ʾ���������
	 * д�ڷ���ֵ֮ǰ void֮ǰ <T>
	 * =======��ʾ������һ������ ��������� T
	 * ������Ϳ���ʹ�����������  T
	 * */
	
	public static <T> void swap1(T[] arr ,int a,int b) {
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/*private static void swap1(String[] arr2, int i, int j) {
		String temp1 = arr2[i];
		arr2[i] = arr2[j];
		arr2[j] = temp1;
	}

	private static void swap1(int[] arr1, int i, int j) {
		//����һ���м����
		int temp = arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = temp;
	}*/

}
