package generateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zjh
 * @Date 2018/11/01,22:40
 * @Description 给定一个整数n，排列出n个括号所有正确的组合方式
 * @Solution 递归的方法，一个结果集List<String>，剩余的'('个数，剩余的')'个数，组合出的括号串str。
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        generateParenthesis(res, n, n, "");

        return res;
    }

    private void generateParenthesis(List<String> res, int left, int right, String str) {

       if(left > right)
           return;

        if (left == 0 && right == 0) {
            res.add(str);
        }
        else {
            if (left > 0) { generateParenthesis(res, left-1, right, str+'('); }
            if (right > 0) { generateParenthesis(res, left, right-1, str+')'); }
        }

    }

    public static void main(String[] args) {
        List<String> list = new GenerateParentheses().generateParenthesis(3);

        for(String s : list) {
            System.out.println(s);
        }
    }
}
