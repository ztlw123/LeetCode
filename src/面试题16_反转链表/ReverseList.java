package 面试题16_反转链表;

/**
 * @Author zjh
 * @Date 2019/03/11,11:11
 */
public class ReverseList {

    public static ListNode reverseList(ListNode head) {

        if(head == null)
            return null;

        if(head.next == null)
            return head;

        ListNode node = head;
        ListNode pre = null;

        while (node != null) {
            ListNode nextNode = node.next;

            node.next = pre;

            pre = node;
            node = nextNode;
        }

        return pre;
    }

    public static ListNode reverse1(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;

        ListNode node = head;
        ListNode temp = null;
        while (node != null) {
            ListNode nextNode = node.next;
            node.next = temp;
            temp = node;
            node = nextNode;
        }

        return temp;
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

        ListNode reverse = reverse1(l1);
        print(reverse);
    }
}
