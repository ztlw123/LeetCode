package 排序;

import addTwoNumbers.ListNode;

import java.util.HashMap;

/**
 * @Author zjh
 * @Date 2019/03/21,09:46
 */
public class SortListNode {

    //链表排序
    public static void orderList(ListNode head) {

        ListNode node = head;

        while (node.next != null) {

            ListNode nextNode = node.next;

            while (nextNode != null) {
                if(node.val > nextNode.val) {
                    int temp = node.val;
                    node.val = nextNode.val;
                    nextNode.val = temp;
                }

                nextNode = nextNode.next;
            }

            node = node.next;
        }
    }

    //链表删重复数据
    public static void delDuplecate(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode node = head;
        ListNode pre = null;

        while(node != null) {
            if(map.containsKey(node.val))
                pre.next = pre.next.next;
            else {
                map.put(node.val, 1);
                pre = node;
            }

            node = node.next;
        }
    }

    //查找倒数第K个元素
    public static ListNode findLastK(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;

        for(int i=0; i<k-1; i++)
            p2 = p2.next;

        if(p2 == null)
            return null;

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4, null);
        ListNode l2 = new ListNode(5, l1);
        ListNode l3 = new ListNode(1, l2);
        ListNode l4 = new ListNode(3, l3);
        ListNode l5 = new ListNode(1, l4);

        System.out.println(findLastK(l5, 4).val);

    }
}
