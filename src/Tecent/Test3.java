package Tecent;

import java.util.Scanner;

/**
 * @Author zjh
 * @Date 2019/09/01,20:50
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        int sumBox = 0;

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
            sumBox += arr[i];
        }

        if(sumBox <= m) {
            System.out.println(n+1);
            return;
        }

        System.out.println(m);
    }
}
