package cn.itcast.test04;

public class TestEnum2 {

}

enum Color11 {
	RED("red"){

		@Override
		public void print1() {
			System.out.println("red");
			
		}
		
	},GREEN("green"){

		@Override
		public void print1() {
			System.out.println("green");
			
		}
		
	},YELLOW("yellow") {

		@Override
		public void print1() {
			System.out.println("yellow");
			
		}
	};
	private Color11(String name) {}
	//���󷽷�
	//����ö������д�˳��󷽷�֮����Ҫ��ÿ��ʵ�����涼ʵ�ֳ��󷽷�
	public abstract void print1();
}
