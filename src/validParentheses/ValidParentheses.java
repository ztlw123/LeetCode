package validParentheses;

import java.util.ArrayList;

/**
 * @Author zjh
 * @Date 2018/10/29,13:45
 * @Description 括号匹配问题，当字符串长度为0时表示匹配
 * @Solution 最好用Stack实现
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s==null || s.equals("")){
            return true;
        }

        ArrayList<Character> list = new ArrayList<>();

        for(int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);

            if(ch=='{' || ch=='[' || ch=='(') {
                list.add(ch);
            }
            else if(ch == '}') {
                if(list.size()!=0 && list.get(list.size()-1) == '{'){
                    list.remove(list.size()-1);
                    continue;
                }
                else {
                    return false;
                }
            }
            else if(ch == ']') {
                if(list.size()!=0 && list.get(list.size()-1) == '['){
                    list.remove(list.size()-1);
                    continue;
                }
                else {
                    return false;
                }
            }
            else if(ch == ')') {
                if(list.size()!=0 && list.get(list.size()-1) == '('){
                    list.remove(list.size()-1);
                    continue;
                }
                else {
                    return false;
                }
            }
        }

        if(list.size() == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("[][]()"));
    }
}
