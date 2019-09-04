package 面试题12_打印1到最大的n位数;

/**
 * @Author zjh
 * @Date 2019/03/08,16:28
 * @Description 给定一个整数n，按顺序打印从1开始，到最大的n位数。
 * @Solution 先用一个整型的数组来存储可能出现的大数，递归调用从下标为0的位置开始填0~9，最后填到下标n-1的时候开始打印
 */
public class Print1ToMaxN {

    public static void print1ToMaxN(int n) {

        if(n<=0)
            return;

        int[] result = new int[n];

        printArray(result, 0);
    }

    private static void printArray(int[] result, int n) {
        if(n != result.length) {
            for(int i=0; i<10; i++) {
                result[n] = i;
                printArray(result, n+1);
            }
        }
        else {
            int head = 0;
            for(int i=0; i<result.length; i++) {
                if(result[i] != 0) {
                    head = i;
                    break;
                }
            }

            for(int i=head; i<result.length; i++)
                System.out.print(result[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Print1ToMaxN.print1ToMaxN(10);
    }
}
