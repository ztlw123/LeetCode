package 面试题15_链表中倒数第k个结点;

/**
 * @Author zjh
 * @Date 2019/03/11,10:54
 */
public class TheKthToTail {

    public static ListNode theKthToTail(ListNode head, int k) {

        if(head == null || k == 0)
            return null;

        ListNode tail = head;
        ListNode result;

        for(int i=0; i<k-1; i++) {
            if(tail.next != null)
                tail = tail.next;
            else
                return null;
        }

        result = head;

        while (tail.next != null) {
            result = result.next;
            tail = tail.next;
        }

        return result;
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

        System.out.println(TheKthToTail.theKthToTail(l1, 2).value);
    }
}
