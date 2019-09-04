package addTwoNumbers;

import java.io.Serializable;

/**
 * @Author zjh
 * @Date 2018/09/13,10:59
 */
public class ListNode implements Serializable {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
