package 面试题24_二叉搜索树的后序遍历序列;

import java.util.Arrays;

/**
 * @Author zjh
 * @Date 2019/03/13,09:53
 * @Description 给定一个整数数组，判断该数组是否某二叉搜索树的后序遍历的结果
 * @Solution
 */
public class BinarySearchTreePost {

    public static boolean binarySearch(int[] arr) {

        if(arr == null || arr.length <= 0)
            return false;

        int root = arr[arr.length-1];

        int i=0;
        for(; i<arr.length-1; i++) {
            if(arr[i] > root)
                break;
        }

        int j=i;
        for(; j<arr.length-1; j++) {
            if(arr[j] < root)
                return false;
        }

        boolean left = true;
        if(i>0)
            left = binarySearch(Arrays.copyOfRange(arr, 0, i));

        boolean right = true;
        if(i<arr.length-1)
            right = binarySearch(Arrays.copyOfRange(arr, i, arr.length-1));

        return left && right;
    }
}
