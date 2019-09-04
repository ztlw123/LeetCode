package HuaWei;

import java.util.Scanner;

/**
 * @Author zjh
 * @Date 2019/08/07,09:08
 * @Description 返回一个Long类型整数的所有质数因子，例如180，返回2 2 3 3 5
 */
public class ZhiShu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        String result = getResult(num);
        System.out.println(result);
        zhishu(12);
    }

    public static String getResult(long ulDataInput){
        int divisor = 2;
        String result = "";

        while (ulDataInput != 1) {
            while (ulDataInput % divisor == 0) {
                ulDataInput = ulDataInput/divisor;
                result = result+ divisor + " ";
            }
            divisor ++;
        }

        return result;
    }

    //N以内有多少质数
    public static void zhishu(int N) {

        for(int i=N; i>=0; i--) {
            for(int j=i-1; j>=1; j--) {
                if(i%j == 0)
                    break;
                if(j<=2)
                    System.out.println(i);
            }
        }
    }
}
