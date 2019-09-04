package 面试题4_替换空格;

/**
 * @Author zjh
 * @Date 2019/02/26,21:30
 * @Description 把字符串中所有空格替换为%20
 * @Solution
 */
public class ReplaceSpace {

    public static String replace(String str) {

        if(str == null)
            return null;

        char[] strArr = str.toCharArray();

        int originLength = strArr.length;
        int spaceCount = 0;

        for(int i=0; i<originLength; i++) {
            if(strArr[i] == ' ')
                spaceCount++;
        }

        char[] temp = new char[originLength + spaceCount*2];

        int j = 0;

        for(int k=0; k<originLength; k++) {
            if(strArr[k] == ' ') {
                temp[j] = '%';
                temp[j+1] = '2';
                temp[j+2] = '0';

                j+=3;
            }
            else {
                temp[j++] = strArr[k];
            }
        }
        return new String(temp);
    }

    public static void main(String[] args) {

        String s1 = "we are happy family!";
        System.out.println(ReplaceSpace.replace(s1));
    }
}
