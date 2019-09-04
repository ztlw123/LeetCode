package 面试题11_数值的整数次方;

/**
 * @Author zjh
 * @Date 2019/03/08,09:53
 */
public class Power {

    public static double power(double base, int exp) {

        if(equal(base, 0.0))
            return 0;

        if(exp == 0)
            return 1;
        else if(exp < 0)
            return multi(1/base, -exp);
        else
            return multi(base, exp);

    }

    public static double multi(double base, int exp) {
        double result = 1.0;
        for(int i=1; i<=exp; i++)
            result *= base;

        return result;
    }

    public static boolean equal(double num1, double num2) {
        if(num1 - num2 > -0.0000001 && num1 - num2 < 0.0000001)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(Power.power(0.0, 0));
        System.out.println(Power.power(2.0, 0));
        System.out.println(Power.power(-2.0, 0));
        System.out.println(Power.power(0.0, 2));
        System.out.println(Power.power(0.0, -2));
        System.out.println(Power.power(2.000, 3));
        System.out.println(Power.power(2.000, -3));




    }
}
