package longestPalindromeSubstring;

/**
 * @author 翟佳豪
 * @date 2018/09/19
 * @since Version 1.0
 */
//  Q: 求一个字符串中最长的回文字符串
//  Best answer: 暂无
public class LongestPalindromeSub {

    public boolean isPalindromeSub(String s) {

        int length = s.length();

        for(int i=0; i<length/2; i++) {
            if(s.charAt(i) != s.charAt(length-1-i))
                return false;
        }

        return true;
    }

    public String longestPalindrome(String s) {

        for(int i=s.length(); i>0; i--){
            for(int j=0; j<=s.length()-i; j++){
                if(isPalindromeSub(s.substring(j, i+j)))
                    return s.substring(j, i+j);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindromeSub().longestPalindrome("abbcbdcc"));
    }
}
