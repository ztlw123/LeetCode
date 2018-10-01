package stringToInteger;

/**
 * @Author zjh
 * @Date 2018/09/25,18:54
 */
public class StringToInteger {
    public int myAtoi(String str) {

        int flag = 1;
        long result = 0;
        str = str.trim();

        if(str == null || str.length() < 1)
            return 0;

        if(str.charAt(0) == '-'){
            flag = -1;
        }
        else if(str.charAt(0) == '+'){
            flag = 1;
        }
        else if(str.charAt(0) < '0' || str.charAt(0) > '9'){
            return 0;
        }

        if(str.charAt(0) == '-' || str.charAt(0) =='+') {
            for (int i = 1; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch < '0' || ch > '9')
                    break;
                else {
                    result = result * 10 + (ch - '0');
                    if(result*flag >= Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                    if(result*flag <= Integer.MIN_VALUE)
                        return Integer.MIN_VALUE;
                }
            }
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch < '0' || ch > '9')
                    break;
                else {
                    result = result * 10 + (ch - '0');
                    if(result*flag >= Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                    if(result*flag <= Integer.MIN_VALUE)
                        return Integer.MIN_VALUE;
                }

            }
        }
        result = result * flag;
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi(" -42eqweqw"));
    }
}
