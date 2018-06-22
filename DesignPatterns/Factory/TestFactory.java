package Factory;

import java.util.Scanner;

public class TestFactory {
	
    public static void main(String[] args) {
    	
    	Operation oper = null;
    	
        System.out.println("请输入您要运算的数字A：");
        Scanner sc1=new Scanner(System.in);
        double num1 = sc1.nextDouble();
        System.out.println("请输入运算符：");
        Scanner sc2=new Scanner(System.in);
        String operate = sc2.next();
        System.out.println("请输入您要运算的数字B：");
        Scanner sc3=new Scanner(System.in);
        double num2 = sc3.nextDouble();
    	
        oper = OperationFactory.createOperation(operate);
        oper.setNumberA(num1);
    	oper.setNumberB(num2);
    	
    	
    	double result = oper.getResult();
    	System.out.println(result);
    }
}
