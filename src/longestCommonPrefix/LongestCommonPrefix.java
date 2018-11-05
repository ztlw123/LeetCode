package longestCommonPrefix;

/**
 * @Author zjh
 * @Date 2018/10/12,15:59
 * @Description 查找一组字符串中最长的头子串，若没有则返回“”
 * @Solution 先拿到最短字符串的长度minLength，由于最大公共串最多就是最小字符串，因此外层循环最大到minLength。
 *           内层循环每次用第一个字符串的字符与其他字符串的字符比较，如果有不相等马上跳出循环，返回子串。
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        //字符串数组为空，则返回空串
        if(strs == null || strs.length == 0) {return "";}

        int len = 0;
        int minLength = strs[0].length();

        //拿到字符串数组中最短字符串的长度
        for (int i=1; i<strs.length; i++) {
            minLength = (strs[i].length() < minLength) ? strs[i].length() : minLength;
        }

        for (; len<minLength; len++) {
            for (int j=1; j<strs.length; j++) {

                if(strs[0].charAt(len) != strs[j].charAt(len)) {
                    return strs[0].substring(0, len);
                }
            }
        }
        if(len == 0) {return "";}

        return strs[0].substring(0, len);
    }

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        String result = new LongestCommonPrefix().longestCommonPrefix(strs);

        System.out.println(result);
    }
}
