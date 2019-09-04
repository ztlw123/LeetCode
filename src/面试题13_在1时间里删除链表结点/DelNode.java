package 面试题13_在1时间里删除链表结点;

/**
 * @Author zjh
 * @Date 2019/03/08,17:50
 */
public class DelNode {

    public static void delNode(ListNode pList, ListNode n) {

        if(pList == null || n == null)
            return;

        if(pList == n)
            pList = null;
        else {
            if(n.next == null) {

                ListNode tempNode = pList;

                while (tempNode.next != n)
                    tempNode = tempNode.next;

                tempNode.next = null;
            }
            else {
                n.value = n.next.value;
                n.next = n.next.next;
            }
        }
    }

    public static void print(ListNode node) {

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode l4 = new ListNode(4, null);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        DelNode.print(l4);
        DelNode.delNode(l4, l4);
        DelNode.print(l4);
    }
}
