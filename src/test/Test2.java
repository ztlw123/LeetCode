package test;

/**
 * @Author zjh
 * @Date 2018/09/19,16:15
 */
public class Test2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];

        System.arraycopy(a, 1, b, 1, 4);

        for (int i=0; i<5; i++)
            System.out.println(b[i]);
    }
}
