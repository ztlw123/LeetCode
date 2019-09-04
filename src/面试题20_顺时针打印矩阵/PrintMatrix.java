package 面试题20_顺时针打印矩阵;

/**
 * @Author zjh
 * @Date 2019/03/11,16:53
 */
public class PrintMatrix {

    public static void printMatrix(int[][] matrix) {

        if(matrix == null || matrix.length == 0)
            return;

        int times = (matrix.length+1) >> 1;
        for(int i=0; i<times; i++) {
            //打印横上排
            for(int j=i; j<matrix.length-i; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("      ");

            //打印竖右列
            for(int j=i+1; j<matrix.length-i; j++)
                System.out.print(matrix[j][matrix.length-i-1] + " ");
            System.out.print("      ");

            //打印横下排
            for(int j=matrix.length-i-2; j>=i; j--)
                System.out.print(matrix[matrix.length-i-1][j] + " ");
            System.out.print("      ");

            //打印竖左列
            for(int j=matrix.length-i-2; j>i; j--)
                System.out.print(matrix[j][i] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        PrintMatrix.printMatrix(matrix);
    }
}
