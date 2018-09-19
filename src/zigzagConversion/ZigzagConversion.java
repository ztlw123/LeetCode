package zigzagConversion;

/**
 * @author 翟佳豪
 * @date 2018/09/17
 * @since Version 1.0
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        int length = s.length();
        int col = 1000;
        int flag = 0;

        char[] resultChar = new char[length];
        char[][] zigzag = new char[numRows][col];
        char[] ch = s.toCharArray();

        if(length == 0)
            return "";
        if(numRows == 1)
            return s;

        for(int i=0; i<col; i++){

            for (int j = 0; j < numRows; j++) {
                if(i%(numRows-1) == 0 && flag < length) {
//                    System.out.println(ch[flag]);
                    zigzag[j][i] = ch[flag++];      //整列都要写数据的位置
                }
            }

            if(i%(numRows-1) != 0 && flag < length){
                int k = i%(numRows-1);
//                System.out.println(ch[flag]);
                zigzag[numRows-1-k][i] =  ch[flag++];   //一列只需写一个字符的位置
            }
        }

        int k=0;
        for(int i=0; i<numRows; i++){
            for (int j=0; j<col; j++){
                if(zigzag[i][j] != '\0'){
                    resultChar[k++] = zigzag[i][j];
                }
            }
        }

        return new String(resultChar);
    }

    public static void main(String[] args) {
        System.out.println(new ZigzagConversion().convert("A", 1));
    }
}
