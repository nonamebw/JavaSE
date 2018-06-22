package sort;

public class InsertSort {
	
	public static void insertSort(int [] arr){
		int i,j;
		int n = arr.length;
		int target;
		
		for(i=1;i<n;i++){
			j=i;
			target = arr[i];
			while(j>0 && target < arr[j-1]){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = target;
		}	
	}
	
	public static void main(String[] args){
		int [] arr={3,-2,1,-1,5,2,9,1};
		insertSort(arr);
		
		for(int element:arr){
			System.out.print(element+",");
		}
	}
}
