package reverseNodesInKGroup;

import addTwoNumbers.ListNode;

/**
 * @Author zjh
 * @Date 2018/11/04,16:29
 * @Description 给定链表head，一个整数k，将链表中每k个节点进行转置
 * @Solution
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode last = head;   //给定转置内容前、后两个指针
        int count = 0;

        while (last != null) {
            count++;
            last = last.next;

            if (count == k) {
                ListNode temp = reverse(pre, last);
                count = 0;
                pre = temp;
            }
        }

        return dummy.next;
    }

    public ListNode reverse (ListNode pre, ListNode last) {
        ListNode temp = pre.next;
        ListNode cur = temp.next;

        while (cur != last) {       //每次将temp后面的cur节点移到链表的最前面，即可实现转置
            temp.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = temp.next;        //cur节点每次置为temp后一个节点
        }

        return temp;
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

        ListNode head = new ReverseNodesInKGroup().reverseKGroup(l1, 1);

        while (head != null) {
            System.out.println(head.val);

            head = head.next;
        }
    }
}
