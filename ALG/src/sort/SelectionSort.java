package sort;

import java.util.Arrays;

/**
 * ѡ������
 * ����˼�룺
 *	�ڳ���ΪN�����������У���һ�α���n-1�������ҵ���С����ֵ���һ��Ԫ�ؽ�����
 *	�ڶ��α���n-2�������ҵ���С����ֵ��ڶ���Ԫ�ؽ�����
 *	������
 *	��n-1�α������ҵ���С����ֵ���n-1��Ԫ�ؽ�����������ɡ�
 * @author Mr.luo
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		//��ʼ����
		int num[]={79,12,3,56,34,28,9,100,88};
		//�м����
		int tem;
		for(int i=0 ; i<num.length-1 ; i++){
			int minIndex=i;//��Сֵ���±�
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
