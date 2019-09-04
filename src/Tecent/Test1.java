package Tecent;

import java.util.Scanner;

/**
 * @Author zjh
 * @Date 2019/09/01,20:33
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] nArr = new int[n];
        int[] mArr = new int[m];

        int singleBox=0, singleKey=0, evenBox=0, evenKey=0;

        for(int i=0; i<n; i++) {
            nArr[i] = scanner.nextInt();
            if(nArr[i] % 2 == 0) {
                evenBox++;
            }
            else {
                singleBox++;
            }
        }

        for(int j=0; j<m; j++) {
            mArr[j] = scanner.nextInt();
            if(mArr[j] % 2 == 0) {
                evenKey++;
            }
            else {
                singleKey++;
            }
        }

        int result = Math.min(evenBox, singleKey) + Math.min(singleBox, evenKey);
        System.out.println(result);
    }
}
