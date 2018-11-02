package removeNthNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zjh
 * @Date 2018/10/31,19:56
 * @Description 给定一个链表和一个小于链表长度的值n，删掉倒数第n个节点。
 * @Solution 1.自己方法：遍历链表将节点写入一个list，根据n删除倒数第n个节点。
 *           2.设置快慢两个指针，指针相差为n，当遍历到链表尾时，即找到该节点将其删除。
 */
public class RemoveNthNode {
    public Node removeNthFromEnd(Node head, int n) {
        List<Node> list = new ArrayList<>();

        list.add(head);
        Node node = head.next;

        if (node == null && n == 1)
            return null;

        while (node != null){
            list.add(node);
            node = node.next;
        }

        int size = list.size();
        if(n == 1){
            list.get(size-2).next = null;
        }
        else if(n == size){
            head = head.next;
        }
        else {
            list.get(size - n - 1).next = list.get(size - n + 1);
        }

        return head;
    }

    public Node removeNthFromEnd_2(Node head, int n) {

        Node start = new Node(0);
        start.next = head;

        Node slow = start;
        Node fast = start;

        for (int i=0; i<n+1; i++)
            fast = fast.next;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }

    public static void main(String[] args) {
        Node l1 = new Node(5);
        Node l2 = new Node(3);
        Node l3 = new Node(2);
        Node l4 = new Node(4);
        Node l5 = new Node(1);
        Node l6 = new Node(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        Node node = new RemoveNthNode().removeNthFromEnd_2(l1,6);

        Node temp = node.next;
        System.out.println(node.val);
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }    }
}
