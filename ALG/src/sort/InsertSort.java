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
        return init;
    }
}
