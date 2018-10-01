package romanToInteger;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zjh
 * @Date 2018/09/18,21:02
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> charToInt = new HashMap<>();
        charToInt.put('I', 1);
        charToInt.put('V', 5);
        charToInt.put('X', 10);
        charToInt.put('L', 50);
        charToInt.put('C', 100);
        charToInt.put('D', 500);
        charToInt.put('M', 1000);

        char[] sArr = s.toCharArray();
        int length = sArr.length;
        int result = 0, cmp = 0;

        for(int i = length - 1; i >= 0; i--){

            int temp = charToInt.get(sArr[i]);

            if(temp >= cmp) {
                result += temp;
                cmp = temp;
            }
            else {
                result -= temp;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }
}
