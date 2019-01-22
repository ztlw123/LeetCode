package validSudoku;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zjh
 * @Date 2018/11/16,19:42
 * @Description 判断一组数独猜谜的数是否合法
 * @Solution 分别按行、列、块遍历,存在重复则不合法
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        List<Character> row_list = new ArrayList<>();
        List<Character> col_list = new ArrayList<>();
        List<Character> block_list = new ArrayList<>();

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] != '.') {
                    if(row_list.contains(board[i][j])) {
                        return false;
                    }
                    else {
                        row_list.add(board[i][j]);
                    }
                }

                if(board[j][i] != '.') {
                    if(col_list.contains(board[j][i])) {
                        return false;
                    }
                    else {
                        col_list.add(board[j][i]);
                    }
                }

                if(board[i/3*3+j/3][i%3*3+j%3] != '.') {
                    if(block_list.contains(board[i/3*3+j/3][i%3*3+j%3])) {
                        return false;
                    }
                    else {
                        block_list.add(board[i/3*3+j/3][i%3*3+j%3]);
                    }
                }
            }
            row_list.clear();
            col_list.clear();
            block_list.clear();
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] a = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        char[][] b = {{'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(new ValidSudoku().isValidSudoku(b));
    }
}
