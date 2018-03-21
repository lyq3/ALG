package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 基本思想：两个数比较大小，较大的数下沉，较小的数冒起来。（或相反）
 * @author Mr.luo
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		//初始数据
		int num[]={79,12,3,56,34,28,9,100,88};

		//中间变量
		int tem;
		for(int i=0 ; i<num.length-1 ; i++){//表示趟数，一共length-1趟
			for(int j=i+1 ; j<num.length ; j++){
				if(num[i]>num[j]){
					tem=num[j];
					num[j]=num[i];
					num[i]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		sort2();
		sort3();
	}

	/**
	 * 冒泡排序,(正规)
	 */
	static void sort2(){
		//初始数据
		int num[]={79,12,3,56,34,28,9,100,88};

		//中间变量
		int tem;
		for(int i=0 ; i<num.length-1 ; i++){
			for(int j=num.length-1 ; i<j ;j--){
				if(num[j]<num[j-1]){
					tem=num[j];
					num[j]=num[j-1];
					num[j-1]=tem;
				}

			}
		}
		System.out.println(Arrays.toString(num));
	}

	/**
	 * 冒泡排序,优化，(推荐)
	 */
	static void sort3(){
		//初始数据
		int num[]={79,12,3,56,34,28,9,88,99,100};

		//中间变量
		int tem;
		boolean flag;
		for(int i=0 ; i<num.length-1 ; i++){
			flag=false;
			for(int j=num.length-1 ; i<j ;j--){
				if(num[j]<num[j-1]){
					tem=num[j];
					num[j]=num[j-1];
					num[j-1]=tem;
					flag=true;
				}
			}
			if(!flag) break;
		}
		System.out.println(Arrays.toString(num));
	}
}
