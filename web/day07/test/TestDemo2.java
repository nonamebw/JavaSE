package cn.itcast.test;

public class TestDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		add1();
	}

	//ʵ�ִ�1�ӵ�100
	public static void add1() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
