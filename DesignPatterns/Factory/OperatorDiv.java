package Factory;

public class OperatorDiv extends Operation{
	public double getResult(){
		double result = 0;
		if(this.getNumberB()!=0){
			return result = this.getNumberA()/this.getNumberB();
		}else{
			System.out.println("除数不能为0");
			return 0;
		}	
	}
}
