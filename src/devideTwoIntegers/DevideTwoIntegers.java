package devideTwoIntegers;

/**
 * @Author zjh
 * @Date 2018/11/09,17:46
 * @Description 不用乘除，次方，mod这些方法，来实现两个整数的除法
 * @Solution https://blog.csdn.net/yuqieshidi/article/details/48829465
 */
public class DevideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int result = 0;

        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if(divisor == 1)
            return dividend;
        if(divisor == -1)
            return -dividend;

        long dividend_abs = Math.abs((long)dividend);
        long divisor_abs = Math.abs((long)divisor);

        long temp = divisor_abs;

        while(dividend_abs >= divisor_abs) {

            int count = 0;

            while(dividend_abs >= temp<<count) {
                count++;
            }

            result+= 1<<(count-1);

            dividend_abs -= temp<<(count-1);
        }

        if(dividend>0 && divisor>0 || dividend<0 && divisor<0)
            return result;
        else
            return -result;
    }

    public static void main(String[] args) {
        System.out.println(new DevideTwoIntegers().divide(128,2));
    }
}
