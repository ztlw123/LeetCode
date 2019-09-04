package 面试题5_倒序打印链表;

import java.util.Stack;

/**
 * @Author zjh
 * @Date 2019/02/27,17:08
 */
public class PrintList {


    public static void reversePrint_1(ListNode head) {

        if(head == null)
            return;

        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;

        while (node != null) {
            stack.push(node);

            node = node.next;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().value);
        }
    }

    public static void main(String[] args) {

        ListNode h4 = new ListNode(4, null);
        ListNode h3 = new ListNode(3, h4);
        ListNode h2 = new ListNode(2, h3);
        ListNode h1 = new ListNode(1, h2);
        ListNode head = new ListNode(1, h1);

        reversePrint_1(head);


    }

}
