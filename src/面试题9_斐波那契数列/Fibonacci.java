package 面试题9_斐波那契数列;

/**
 * @Author zjh
 * @Date 2019/03/01,11:22
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if(n <= 0)
            return 0;

        if(n == 1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long fi_2(int n) {

        long n_1 = 0;
        long n_2 = 1;

        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        long N = 0L;

        for(int i=2; i<=n; i++) {
            N = n_1 + n_2;

            n_1 = n_2;
            n_2 = N;
        }

        return N;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.fi_2(10));
    }
}
