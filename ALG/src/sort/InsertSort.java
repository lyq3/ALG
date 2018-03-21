package sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] init = {12,3434,1,45,978,3,78,9,6,213,4,75,1,3};
        System.out.println(Arrays.toString(init));
        int[] result = insertSort(init);
        System.out.println(Arrays.toString(result));
    }

    /**
     * 排序方法
     * @param init
     * @return
     */
    private static int[] insertSort(int[] init){

        for(int i = 1 ,len = init.length; i< len ; i++){//从第二个元素开始往前插入
            int temp = init[i]; //记录当前需要插入的数据
            int j;             //记录当前的位置
            for(j = i-1 ; j >=0 && temp < init[j] ; j--){ //与前面排好序的数据一个个比较，比前面小就把前面的数据往后移动
                init[j+1] = init[j];  //移动数据
            }
            init[j+1] = temp;  //将之前保存的需要插入的数据插入到移动空出来的位置
        }
        return init;
    }
}
