package HuaWei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class h2015 {
    public static void main(String[] args) {
        hw_1();
    }

    /**
     * @Author zjh
     * @Date 2019/07/25,16:31
     * @Description 按要求分解字符串，输入两个数M，N；M代表输入的M串字符串，N代表输出的每串字符串的位数，
     *              不够补0。例如：输入2,8， “abc” ，“123456789”，则输出为“abc00000”,“12345678“,”90000000”
     */
    public static void hw_1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.next();
            String temp = arr[i];
            int zeroNum = temp.length() % m;
            if (zeroNum != 0) {
                int j = m-zeroNum;
                while (j>0) {
                    temp += "0";
                    j--;
                }
            }

            int k=0;
            while (k<temp.length()) {
                System.out.println(temp.substring(k, k+m));
                k+=m;
            }
        }
    }

    /**
     * @Author zjh
     * @Date 2019/07/25,16:31
     * @Description 去除重复字符并排序
     *     运行时间限制：无限制
     *     内容限制： 无限制
     *     输入： 字符串
     *     输出： 去除重复字符并排序的字符串
     *     样例输入： aabcdefff
     *     样例输出： abcdef
     */
    public static void hw_2(String str) {
        int[] list = new int[200];
        char[] arr = str.toCharArray();
        for (int i=0; i<arr.length; i++){
            if (list[arr[i]] == 0) {
                list[arr[i]] = 1;
            }
        }

        for (int j=0; j<200; j++) {
            if(list[j] == 1){
                System.out.print((char)j);
            }
        }
    }


}
