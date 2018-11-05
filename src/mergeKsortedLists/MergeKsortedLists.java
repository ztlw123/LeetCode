package mergeKsortedLists;

import addTwoNumbers.ListNode;

/**
 * @Author zjh
 * @Date 2018/11/02,11:06
 * @Description 将k个链表进行排序
 * @Solution 每次将头尾两个链表排序
 */
public class MergeKsortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        int n = lists.length;

        if (n==0) { return null; }

        while (n > 1) {

            for(int i=0; i< n/2; i++) {
                lists[i] = mergeTwoLists(lists[i], lists[n-i-1]);
            }

            n = (n+1) / 2;
        }

        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

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
        ListNode l8 = new ListNode(8);
        ListNode l9 = new ListNode(9);

        l1.next = l3;
        l3.next = l5;

        l2.next = l4;
        l4.next = l9;

        l6.next = l7;
        l7.next = l8;

        ListNode[] list = {l1, l6, l2};

        ListNode result = new MergeKsortedLists().mergeKLists(list);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
