package letterCombinationsOfPhone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author zjh
 * @Date 2018/10/30,10:45
 * @Description 给定一个由2~9的数字组成的字符串，这几个数字分别对应九键手机的几个字母，求出所有可能组合的字母字符串
 * @Solution
 */
public class LetterCombinationsOfPhone {
    public List<String> letterCombinations(String digits) {
        String[] letter_arr = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result_list = new ArrayList<>();

        if(digits == null || digits.equals(""))
            return result_list;

        letterCombinations(result_list, digits, 0, letter_arr, "");

        return result_list;
    }

    /**
     * @methodname letterCombinations
     * @description
     * @author zjh
     * @date 15:53,2018/10/30
     * @param result_list   最终返回的字符串list
     * @param digits        给定的‘2~9’的字符串
     * @param index         指到digits某一位的下标
     * @param letter_arr    字母表
     * @param oneOfStr      从digits中的得到的一个字母串
     * @return
     */
    private void letterCombinations(List<String> result_list, String digits, int index, String[] letter_arr, String oneOfStr) {

        //当下标指到digits串的结束位置表示得到一个字母串，加入结果集
        if(index == digits.length()){
            result_list.add(oneOfStr);
            return;
        }

        String temp = letter_arr[digits.charAt(index) - '2'];

        for(int i=0; i<temp.length(); i++) {

            String s = oneOfStr + temp.charAt(i);
            letterCombinations(result_list, digits, index+1, letter_arr, s);
        }
    }


    public List<String> letterCombinations2(String digits) {
        String[] letter_arr = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result_list = new ArrayList<>();
        result_list.add("");            //给一个初始，否则进不了最后一层循环

        if(digits == null || digits.equals(""))
            return result_list;

        char[] dig_arr = digits.toCharArray();

        for (int i=0; i<dig_arr.length; i++){

            char[] ch = letter_arr[dig_arr[i]-'2'].toCharArray();    //拿出一个数字字符对应的字符串

            int size = result_list.size();      //在这里一定要把结果集的长度拿出来，表示要在它基础上添加一位字符
            for (int j=0; j<size; j++){
                String new_str = result_list.remove(0);

                for(int k=0; k<ch.length; k++){
                    result_list.add(new String(new_str+ch[k]));
                }
            }
        }

        return result_list;
    }

    public static void main(String[] args) {
        List<String> list = new LetterCombinationsOfPhone().letterCombinations2("27");

        System.out.println(Arrays.toString(list.toArray()));
    }
}
