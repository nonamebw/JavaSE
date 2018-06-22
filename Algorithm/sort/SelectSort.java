package sort;

//第一轮循环，选择数组中最小的值放入数组第一位
//第二轮循环（在不包含第一位的数组中进行），选择最小的数放入数组中的第二位，依次类推。

public class SelectSort {
	
	public static void selectSort(int[] a){
		int n = a.length;
		for(int i=0;i<n;i++){
			int k=i;
			//找出最小值的角标
			for(int j=i+1;j<n;j++){
				if(a[j]<a[k]){
					k=j;//k始终记录着最小的一个值的角标
				}
			}
			//将最小值放到排序序列末尾
			if(k>i){
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
		}
	}
	
	
	public static void main(String[] args){
		int[] b={1,3,1,4,5,2,0};
		selectSort(b);
		
		for(int i:b){
			System.out.print(i+",");
		}
	}
}
