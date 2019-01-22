package palindromeNumber;

/**
 * @author 翟佳豪
 * @date 2018/09/17
 * @since Version 1.0
 * @Description 判断一个整数逆置后是否不变
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int reverse = 0;
        int temp,i = 0;

        if(x < 0){
            return false;
        }

        int replace_x = x;

        while(replace_x != 0){
            temp = replace_x % 10;
            reverse = reverse * 10 + temp;
            replace_x /= 10;
        }

        return (x == reverse ? true : false);
    }
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(2123212));
    }
}
