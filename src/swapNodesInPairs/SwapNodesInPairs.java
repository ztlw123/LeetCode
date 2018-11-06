package swapNodesInPairs;

import addTwoNumbers.ListNode;

/**
 * @Author zjh
 * @Date 2018/11/04,15:20
 * @Description 将链表中的节点两两交换，并且不占用额外空间
 * @Solution 先安一个头结点，再两两交换，思路简单，但一定记住得先摘下后一个节点
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode l = new ListNode(0);
        l.next = head;

        ListNode temp_node = l;
        while(temp_node.next != null && temp_node.next.next != null) {
            ListNode right_node = temp_node.next.next;
            temp_node.next.next = right_node.next;
            right_node.next = temp_node.next;
            temp_node.next = right_node;

            temp_node = temp_node.next.next;
        }

        return l.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        ListNode head = new SwapNodesInPairs().swapPairs(l1);

        while (head != null) {
            System.out.println(head.val);

            head = head.next;
        }
    }
}
