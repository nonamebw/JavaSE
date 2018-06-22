package sort;

//如果对于一个本身有序的序列，或则序列后面一大部分都是有序的序列，
//上面的算法就会浪费很多的时间开销，这里设置一个标志flag，如果这一趟发生了交换，
//则为true，否则为false。明显如果有一趟没有发生交换，
//说明排序已经完成

public class BubbleSort2 {
	
	public static void bubbleSort2(int[] a,int n){
		int j,k=n;
		boolean flag = true;
		while(flag){
			flag = false;
			for(j=1;j<k;j++){
				if(a[j-1] > a[j]){
					int temp;
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					flag = true;
				}
			}
			k--;
		}
	}
	
	public static void main(String[] args){
		int[] arr = {1,3,1,4,5,2,0};
		BubbleSort2.bubbleSort2(arr, arr.length);
		
		for(int element:arr){
			System.out.print(element+",");
		}
	}

}
