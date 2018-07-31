package cn.itcast.test08;
/**
 * 演示可变参数
 * @author asus
 *
 */
public class TestDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int..num;
		add1(10,20);
		add1(10,20,30);
		add1(10,20,30,40);
	}
	
	public static void add1(int a,int...nums) {
		//nums理解为一个数组，这个数组存储传递过来的参数
		//System.out.println(nums.length);
		int sum = 0;
		//遍历数组
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
	
	/*//实现两个数的相加
	public void add1(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	//实现三个数的相加
	public void add1(int a,int b ,int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	//实现四个数的相加
	public void add1(int a,int b ,int c,int d) {
		int sum = a+b+c+d;
		System.out.println(sum);
	}*/
}




