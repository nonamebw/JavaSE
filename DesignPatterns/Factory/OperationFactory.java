package Factory;

public class OperationFactory {
	
	public static Operation createOperation(String operate){
		Operation oper = null;
		switch(operate){
		case"+":oper = new OperatorAdd();break;
		case"-":oper = new OperatorSub();break;
		case"*":oper = new OperatorMul();break;
		case"/":oper = new OperatorDiv();break;
		default:System.out.println("error!");break;
		}
		return oper;
	}

}
