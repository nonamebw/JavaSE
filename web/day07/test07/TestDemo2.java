package cn.itcast.test07;

import java.util.Arrays;

/**
 * 实现一个泛型方法，接受任意类型的数组，颠倒数组中所有元素
 * @author asus
 *
 */
public class TestDemo2 {

	public static void main(String[] args) {
		Integer[] arr1 = {10,12,13,14,20};
		System.out.println(Arrays.toString(arr1));
		//写方法实现颠倒
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
		 * 基本思想：把第一个元素和最后一个元素交换位置，把第二个元素和倒数第二个元素交换位置。。。。
		 * 交换 长度/2
		 * */
		//遍历数组
		for(int i=0;i<arr1.length/2;i++) {
			/*int temp = arr1[0];
			arr1[0] = arr1[arr1.length-1];*/
			T temp = arr1[i];
			arr1[i] = arr1[arr1.length-i-1];
			arr1[arr1.length-i-1] = temp;
		}
		
	}

	/*public static void reverses(Integer[] arr1) {
		
		 * 基本思想：把第一个元素和最后一个元素交换位置，把第二个元素和倒数第二个元素交换位置。。。。
		 * 交换 长度/2
		 * 
		//遍历数组
		for(int i=0;i<arr1.length/2;i++) {
			int temp = arr1[0];
			arr1[0] = arr1[arr1.length-1];
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length-i-1];
			arr1[arr1.length-i-1] = temp;
		}
		
	}*/

}
