package 面试题21_包含min函数的栈;

import java.util.Stack;

/**
 * @Author zjh
 * @Date 2019/03/12,09:56
 * @Description 定义一个栈，其中有一个min函数，可以得到栈中最小的数
 * @Solution 设置一个数据栈，一个辅助栈，每次压入数据栈的数与辅助栈顶比较，若小于，则压入辅助栈，否则复制辅助栈顶数压入栈。
 */
public class MinStack {

    private Stack<Integer> dataStack;

    private Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int node) {
        dataStack.push(node);

        if(minStack.empty() || node < minStack.peek()) {
            minStack.push(node);
        }
        else {
            minStack.push(minStack.peek());
        }
    }

    public int pop() {
        if (!dataStack.empty() && !minStack.empty()) {
            minStack.pop();
            return dataStack.pop();
        }

        return 0;
    }

    public int min() {
        if(!minStack.empty())
            return minStack.peek();

        return 0;
    }
}
