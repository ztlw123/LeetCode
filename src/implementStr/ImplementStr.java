package implementStr;

/**
 * @Author zjh
 * @Date 2018/11/06,22:00
 * @Description 给定一个字符串，一个子串，找出子串在该字符串中出现的位置，即KMP算法
 * @Solution 以BBCXABCDABXABCDABCDABDE, ABCDABD为例。
 * 普通方法是从B开始遍历与子串进行匹配，不匹配则后移一位继续比较。
 * KMP算法发现：例如在第五位ABCDAB都已经匹配，则有一部分串是不需要再遍历的。即通过求next值，找出最长匹配（部分匹配）的那段的next值（即最长匹配前后缀长度），对ABCDAB来说next=2.
 *            再求出要向前跳的不需要遍历的位数 = 部分匹配长度 - next值，即 6-2=4。下次直接比较到ABX...
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {

        if(needle == null || needle.equals(""))
            return 0;

        if (needle.length() > haystack.length())
            return -1;

        int hayLen = haystack.length();
        int needLen = needle.length();

        for(int i=0; i<hayLen && (hayLen - needLen + 1) >= 1; i++) {
            if(haystack.substring(i, needLen).equals(needle)) {
                return i;
            }

            needLen++;
        }

        return -1;
    }

    private void next(char[] ch, int[] next) {

        int j = 0;

        next[0] = 0;

        for(int i=1; i<ch.length; i++) {
            while (j>0 && ch[j] != ch[i]) {
                j = next[j-1];
            }

            if(ch[j] == ch[i]) {
                j++;
            }

            next[i] = j;
        }

    }

    public static void main(String[] args) {
        System.out.println(new ImplementStr().strStr("mississippi", "issip"));
    }
}
