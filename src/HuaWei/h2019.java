package HuaWei;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author zjh
 * @Date 2019/07/25,20:53
 */
public class h2019 {
    public static void main(String[] args) {
        hw_2();
    }

    public static void hw_1() {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.next().toCharArray();

        byte[] byteArr = new byte[200];
        for(int i=0; i<arr.length; i++) {
            if(byteArr[arr[i]] !=2 )
                byteArr[arr[i]]++;
        }

        for (int j=0; j<200; j++) {
            if (byteArr[j] == 2)
                System.out.print((char)j);
        }
    }

    public static void hw_2() {
        Scanner scanner = new Scanner(System.in);
        char[] ch = scanner.nextLine().toCharArray();

        int index = 0, max = 1, sum = 1;

        for(int i=1; i<ch.length; i++) {
            if(ch[i] == ch[i-1]) {
                sum++;
            }
            else {
                sum=1;
            }

            if(sum > max || (sum==max && ch[i] < ch[index])) {
                index = i-sum+1;
                max = sum;
            }
        }

        for(int j=index; j<index+max; j++)
            System.out.print(ch[j]);
    }

}
