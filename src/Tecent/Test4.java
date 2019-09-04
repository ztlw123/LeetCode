package Tecent;

import java.util.Scanner;

/**
 * @Author zjh
 * @Date 2019/09/01,21:01
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        if(n<=0){
            System.out.println(0);
            return;
        }

        System.out.println(getVal(arr, 0, n-1, 0));
    }

    public static long getVal(int[] arr, int start, int end, long value) {
        int minIndex = start;
        int minVal = 100001;
        long sum = 0;

        if(start>end || start<0 || end>arr.length-1)
            return value;

        for(int i=start; i<end+1; i++) {
            sum += arr[i];

            if(arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }
        long tempValue = sum * minVal;

        value = tempValue>value ? tempValue:value;

        long valL = getVal(arr,start,minIndex-1, value);
        long valR = getVal(arr,minIndex+1, end, value);

        return Math.max(valL, valR);
    }
}
