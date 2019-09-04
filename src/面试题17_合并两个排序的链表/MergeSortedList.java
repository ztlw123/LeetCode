package 面试题17_合并两个排序的链表;

/**
 * @Author zjh
 * @Date 2019/03/11,15:12
 */
public class MergeSortedList {

    public static ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode head = null;

        if(l1.value < l2.value) {
            head = l1;
            head.next = merge(l1.next, l2);
        }
        else {
            head = l2;
            head.next = merge(l1, l2.next);
        }

        return head;
    }

    public static void print(ListNode node) {

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode l10 = new ListNode(10, null);
        ListNode l9 = new ListNode(9, l10);
        ListNode l8 = new ListNode(8, l9);
        ListNode l7 = new ListNode(2, l8);
        ListNode l6 = new ListNode(1, l7);

        ListNode m = merge(l1, l6);

        print(m);
    }
}
