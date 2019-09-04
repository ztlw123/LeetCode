package 面试题14_调整数组顺序使奇数位于偶数前面;

import java.util.Arrays;

/**
 * @Author zjh
 * @Date 2019/03/11,10:25
 */
public class AdjustArray {

    public static void adjustArray(int[] arr) {

        if (arr.length == 0 || arr == null)
            return;

        int l = 0, r = arr.length - 1;

        while (l < r) {
            while ((arr[l] & 0x1) != 0 && l < r)
                l++;

            while ((arr[r] & 0x1) == 0 && l < r)
                r--;

            if(l<r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,8,1,3,7};

        AdjustArray.adjustArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
