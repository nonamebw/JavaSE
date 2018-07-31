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
	//抽象方法
	//当在枚举里面写了抽象方法之后，需要在每个实例上面都实现抽象方法
	public abstract void print1();
}
