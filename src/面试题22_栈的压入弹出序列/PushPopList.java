package 面试题22_栈的压入弹出序列;

import java.util.Stack;

/**
 * @Author zjh
 * @Date 2019/03/12,10:11
 * @Description 输入两个整数序列，第一个为入栈序列，判断第二个是否是一个出栈序列
 */
public class PushPopList {

    public static boolean judge(int[] pushArr, int[] popArr) {

        Stack<Integer> s = new Stack<>();

        if(pushArr.length == 0 || popArr.length == 0 || pushArr.length != popArr.length)
            return false;

        int index = 0;

        for(int i=0; i<pushArr.length; i++){

            s.push(pushArr[i]);
            while(!s.empty() && s.peek() == popArr[index]) {
                s.pop();
                index++;
            }
        }

        return s.empty();
    }

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};
        int[] output = {4,3,5,1,2};

        System.out.println(PushPopList.judge(input, output));
    }
}
