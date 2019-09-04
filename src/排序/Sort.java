package 排序;

import java.util.Arrays;


/**
 * @Author zjh
 * @Date 2019/02/28,11:26
 */
public class Sort {

    //快排
    public static void quickSort(int[] arr, int start, int end) {
        if(start > end)
            return;

        int lo = start;
        int hi = end;
        int key = arr[lo];

        while (lo < hi) {

            while (lo < hi && arr[hi] >= key)
                hi--;

            arr[lo] = arr[hi];

            while (lo < hi && arr[lo] <= key)
                lo++;

            arr[hi] = arr[lo];
        }

        arr[lo] = key;

        quickSort(arr, start, lo-1);
        quickSort(arr, lo+1, end);
    }

    //选择排序: 每轮把最小的选到第一位，是用第一位不断跟后面比较
    public static void chooseSort(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
               if(arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
            }
        }
    }

    //冒泡排序：每轮把最大的选到最后一位，是元素依次两两比较，把较大的往后冒
    public static void bubbleSort(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //插入排序：先假设第一个数有序，把第二个数插到它的左右，再假设前两个数有序。。循环
    public static void insertSort(int[] arr) {

        for(int i=1; i<arr.length; i++) {
            int flag = arr[i], j=i-1;
            while (j>=0 && arr[j]>flag) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = flag;
        }
    }

    //归并排序：采用分治的策略，将序列分为越来越小的半子表，再对半子表排序，再合并
    public void  mergeSort(int[] arr, int start, int end) {

        if(arr == null || start >= end)
            return;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        //将数组两侧做排序
       int i=start, j=mid+1, k=0;
        int[] temp = new int[end-start+1];

        while (i<=mid && j<=end) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i<=mid)
            temp[k++] = arr[i++];

        while (j<=end)
            temp[k++] = arr[j++];

        for(i=0; i<temp.length; i++)
            arr[start+i] = temp[i];

        temp = null;
    }

    public static void shellSort(int[] arr) {

        for(int increment = arr.length/2; increment>0; increment/=2) {
            for(int i = increment; i<arr.length; i++) {

                int flag = arr[i], j = i-increment;
                while (j>=0 && arr[j] > flag) {
                    arr[j+increment] = arr[j];
                    j -= increment;
                }

                arr[j+increment] = flag;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,7,5,3,2,6};

        quicksort(arr, 0,6);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[]a, int left, int right) {
        if(right<left)
            return;

        int l = left;
        int r = right;
        int key = a[l];

        while (l<r) {
            while (l<r && a[r]>=key)
                r--;
            a[l] = a[r];

            while (l<r && a[l]<=key)
                l++;
            a[r] = a[l];
        }

        a[r] = key;

        quickSort(a, left, r-1);
        quickSort(a, r+1, right);
    }
}
