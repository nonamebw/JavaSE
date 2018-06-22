package sort;

public class BubbleSort1{
	
	public static void bubbleSort1(int [] a,int n){
		int i,j;
		for(i=0;i<n;i++){
			for(j=1;j<n-i;j++){
				if(a[j-1]>a[j]){
					int temp;
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args){
		int[] arr  = {1,3,1,4,5,2,0};
		BubbleSort1.bubbleSort1(arr, arr.length);
		
		for(int element:arr){
			System.out.print(element+",");
		}
	}

}
