package sort;

import java.util.Arrays;

/**
 * ð������
 * ����˼�룺�������Ƚϴ�С���ϴ�����³�����С����ð�����������෴��
 * @author Mr.luo
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		//��ʼ����
		int num[]={79,12,3,56,34,28,9,100,88};
		
		//�м����
		int tem;
		for(int i=0 ; i<num.length-1 ; i++){//��ʾ������һ��length-1��
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
	 * ð������,(����)
	 */
	static void sort2(){
		//��ʼ����
		int num[]={79,12,3,56,34,28,9,100,88};
		
		//�м����
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
	 * ð������,�Ż���(�Ƽ�)
	 */
	static void sort3(){
		//��ʼ����
		int num[]={79,12,3,56,34,28,9,88,99,100};
		
		//�м����
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
