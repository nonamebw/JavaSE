package sort;

public class ShellSort {
	public void shellSort(int[] arr){
		int gap = arr.length/2;
		while(gap>=1){
			//把距离为gap的元素编为一个组，扫描所有组
			for(int i=gap;i<arr.length;i++){
				int j = 0;
				int temp = arr[i];
				
				//对距离为gap的元素组进行排序
				for(j=i-gap;j>=0 && temp<arr[j];j=j-gap){
					arr[j+gap]=arr[j];
				}
				arr[j+gap]=temp;
			}
			
			System.out.format("gap=%d:\t",gap);
			printAll(arr);
			gap=gap/2;//减小分组距离
		}
		
	}
	
	public void printAll(int[] arr){
		for(int value:arr){
			System.out.print(value+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {9,1,2,5,7,4,8,6,3,5,0};
		
		ShellSort shell = new ShellSort();
		System.out.print("排序前：\t");
		shell.printAll(arr);
		shell.shellSort(arr);
		System.out.print("排序后:\t");
		shell.printAll(arr);
	}

}
