package com.lyq3;

import java.util.Arrays;

/**
 * 快速排序：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 * 参考文章：https://blog.csdn.net/IT_ZJYANG/article/details/53406764
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {21,23,56,9,7,323,4,457,7,9,324,3,34234,11};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 主要逻辑方法，进行元素划分，左边的比基数小，右边的比基数大
     * @param arr  排序的数组
     * @param start  低位
     * @param end  高位
     * @return
     */
    public static int divide(int[] arr, int start,int end){
        //选一个元素作为基数
        int base = arr[start];
        //当start=end 时就表示低位和高位重合了，也就交换完毕了
        while (start < end) {
            while (start < end && arr[end] >= base) end--;//从高位往低位扫描，如果大于基数就不管，下标减一；继续扫描
            //如果高位小于基数则交换
            if (start < end){
                arr[start] = arr[start]^arr[end];
                arr[end] = arr[start]^arr[end];
                arr[start] = arr[start]^arr[end];
                //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值右边)，因此右边也要同时向前移动一位
                start ++;
            }
            //然后从低位往高位扫描
            while (start < end && arr[start] <= base) start++;
            if(start < end){
                arr[start] = arr[start]^arr[end];
                arr[end] = arr[start]^arr[end];
                arr[start] = arr[start]^arr[end];
                end --;
            }
        }
        //随便返回一个数，因为此时start=end
        return end;
    }

    /**
     * 递归排序
     * @param arr
     * @param start
     * @param end
     */
    public static void sort(int[] arr, int start,int end){
        if(start > end){
            return ;
        }else {
            //返回基数小标
            int index = divide(arr,start,end);
            //对左边进行排序
            sort(arr,start,index-1);
            //对右边进行排序
            sort(arr,index+1,end);
        }
    }
}
