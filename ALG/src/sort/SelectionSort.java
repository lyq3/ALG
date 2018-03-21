package sort;

import java.util.Arrays;

/**
 * 选择排序
 * 基本思想：
 *	在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
 *	第二次遍历n-2个数，找到最小的数值与第二个元素交换；
 *	。。。
 *	第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成。
 * @author Mr.luo
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		//初始数据
		int num[]={79,12,3,56,34,28,9,100,88};
		//中间变量
		int tem;
		for(int i=0 ; i<num.length-1 ; i++){
			int minIndex=i;//最小值得下标
			for(int j=i+1 ; j<num.length ; j++){
				if(num[j]<num[minIndex]){
					minIndex=j;
				}
			}
			tem=num[i];
			num[i]=num[minIndex];
			num[minIndex]=tem;
		}
		System.out.println(Arrays.toString(num));
	}
}
