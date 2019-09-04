package 面试题7_用两个栈实现队列;

import java.util.Stack;

/**
 * @Author zjh
 * @Date 2019/02/28,10:52
 */
public class CQueue {

    private Stack<Integer> sIn;
    private Stack<Integer> sOut;

    public CQueue() {
        sIn = new Stack<>();
        sOut = new Stack<>();
    }

    public void appendTail(int node) {
        sIn.push(node);
    }

    public int deleteHead() throws Exception {

        if(sOut.empty()) {

            while (!sIn.empty()) {
                sOut.push(sIn.pop());
            }
        }

        if(sOut.empty())
            throw new Exception("queque is empty.");

        return sOut.pop();
    }

    public static void main(String[] args) throws Exception {
        CQueue c = new CQueue();
        c.appendTail(1);
        c.appendTail(2);
        c.appendTail(3);
        c.appendTail(4);

        System.out.println(c.deleteHead());

    }
}
