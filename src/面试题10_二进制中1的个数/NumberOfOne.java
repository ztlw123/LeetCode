package 面试题10_二进制中1的个数;

/**
 * @Author zjh
 * @Date 2019/03/01,13:59
 */
public class NumberOfOne {

    public static int countOne(int n) {

        int count = 0;

        int nAbs = Math.abs(n);

        while (nAbs > 0) {
            if((nAbs & 1) > 0) {
                count++;
            }

            nAbs = nAbs >> 1;
        }

        if(n < 0)
            return count+1;

        return count;
    }

    //或者左移1，第一次跟1比，第二次跟10比。。。这样就不用区分正负数了
    public static void main(String[] args) {
        System.out.println(NumberOfOne.countOne(-32));
    }
}
