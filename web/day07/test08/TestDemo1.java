package cn.itcast.test08;
/**
 * ��ʾ�ɱ����
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
		//nums���Ϊһ�����飬�������洢���ݹ����Ĳ���
		//System.out.println(nums.length);
		int sum = 0;
		//��������
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
	
	/*//ʵ�������������
	public void add1(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	//ʵ�������������
	public void add1(int a,int b ,int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	//ʵ���ĸ��������
	public void add1(int a,int b ,int c,int d) {
		int sum = a+b+c+d;
		System.out.println(sum);
	}*/
}




