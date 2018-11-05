package mergeTwoSortedLists;

import addTwoNumbers.ListNode;

/**
 * @Author zjh
 * @Date 2018/11/01,11:02
 * @Description 合并两个有序的链表，得到的结果仍为有序链表
 * @Solution
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode start = new ListNode(0);
        ListNode end;
        if(l1.val < l2.val){
            start.next = l1;
            end = l1;
            l1 = l1.next;
        }
        else {
            start.next = l2;
            end = l2;
            l2 = l2.next;
        }

        while (l1 != null && l2 != null) {

            if(l1.val < l2.val) {
                end.next = l1;
                end = end.next;
                l1 = l1.next;
            }
            else {
                end.next = l2;
                end = end.next;
                l2 = l2.next;
            }
        }

        if(l1 != null)
            end.next = l1;
        if(l2 != null)
            end.next = l2;

        return start.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);

        l1.next =l3;
        l3.next =l5;
        l5.next = l7;

        l2.next = l4;
        l4.next = l6;

        ListNode result = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
