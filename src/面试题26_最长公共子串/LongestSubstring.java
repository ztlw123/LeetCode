package 面试题26_最长公共子串;

/**
 * @Author zjh
 * @Date 2019/08/26,11:01
 */
public class LongestSubstring {

    public static String longestSubstring(String str1, String str2) {
        if(str1 == null || str2 == null)
            return null;

        int[] beforeArr = new int[str2.length()];
        int[] currentArr = new int[str2.length()];

        int maxLen = 0;
        int pos = 0;

        for(int i=0; i<str1.length(); i++) {

            char temp = str1.charAt(i);

            for(int j=0; j<str2.length(); j++) {
                if(str2.charAt(j) == temp) {
                    if(j==0) {
                        currentArr[j] = 1;
                    }
                    else {
                        currentArr[j] = beforeArr[j-1] + 1;
                    }

                    if(currentArr[j] > maxLen) {
                        maxLen = currentArr[j];
                        pos = j;
                    }
                }

                for(int k=0; k<str2.length(); k++) {
                    beforeArr[k] = currentArr[k];
                }
            }
        }

        return str2.substring(pos-maxLen+1, pos+1);
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("aaaaa","aaa"));
    }
}
