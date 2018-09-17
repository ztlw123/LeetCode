package longestSubstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zjh
 * @Date 2018/09/13,15:20
 */
public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        int length = 0;
        Map<Character, Integer> map = new HashMap<>();

        char[] strArray = s.toCharArray();

        for(int i=0; i<strArray.length; i++) {

            if(map.containsKey(strArray[i])){
                i = map.get(strArray[i]);
                length = (map.size() > length) ? map.size() : length;
                map.clear();
            }
            else{
                map.put(strArray[i], i);
                length = (map.size() > length) ? map.size() : length;
            }

        }

        return length;
    }

    public static void main(String[] args) {
        String str = "pwwkew";

        System.out.println(LongestSubstring.lengthOfLongestSubstring(str));
    }
}
