package HuaWei;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,3,1,2,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] a) {
        for(int i=1; i<a.length; i++) {
            int key = a[i];
            int j = i-1;
            while (j>=0 && key<a[j]) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = key;
        }
    }


}