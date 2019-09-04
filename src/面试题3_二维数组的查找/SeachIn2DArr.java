package 面试题3_二维数组的查找;

/**
 * @Author zjh
 * @Date 2019/02/26,17:45
 * @Description 给定一个二维整型数组和一个目标值num，判断num是否在数组中出现过，其中二维数组从左向右递增，从上到下递增。
 * @Solution 从二维数组的右上角比起，若比右上角数字大，则下移一行；若比其小，则左移一列；若相等，则找到。
 */
public class SeachIn2DArr {

    public boolean search(int[][] arr, int num) {
        int rows = arr.length;
        int cols = arr[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0){
            if(arr[row][col] > num) {
                col--;
            }
            else if(arr[row][col] < num) {
                row++;
            }
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5}, {2,3,4,5,9}};
        System.out.println(new SeachIn2DArr().search(a, 56));
    }
}
