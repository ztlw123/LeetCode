package addTwoNumbers;

/**
 * @Author zjh
 * @Date 2018/09/13,10:57
 */
//  Q: 将两个链表相加求和 如：5->1->2, 3->2->1 为215 + 123 = 338
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int up = 0; //进位，默认为0
        int sum = 0;

        ListNode temp_1 = l1.next;
        ListNode temp_2 = l2.next;

        sum = (l1.val + l2.val) % 10;
        up = (l1.val + l2.val) / 10;
        ListNode result = new ListNode(sum);
        ListNode last = result;

        while(temp_1 != null && temp_2 != null) {
            sum = (temp_1.val + temp_2.val + up) % 10;
            up = (temp_1.val + temp_2.val + up) / 10;

            ListNode childNode = new ListNode(sum);
            childNode.next = null;

            last.next = childNode;
            last = childNode;

            temp_1 = temp_1.next;
            temp_2 = temp_2.next;
        }

        while(temp_1 != null) {
            sum = (temp_1.val + up) % 10;
            up = (temp_1.val + up) / 10;

            ListNode childNode = new ListNode(sum);
            childNode.next = null;

            last.next = childNode;
            last = childNode;

            temp_1 = temp_1.next;
        }

        while(temp_2 != null) {
            sum = (temp_2.val + up) % 10;
            up = (temp_2.val + up) / 10;

            ListNode childNode = new ListNode(sum);
            childNode.next = null;

            last.next = childNode;
            last = childNode;

            temp_2 = temp_2.next;
        }

        if(up > 0){
            ListNode childNode = new ListNode(1);
            childNode.next = null;

            last.next = childNode;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode ge_1 = new ListNode(0);
//        ListNode shi_1 = new ListNode(2);
//        ListNode bai_1 = new ListNode(3);

//        ge_1.setNext(shi_1);
//        shi_1.setNext(bai_1);
//        bai_1.setNext(null);
        ge_1.setNext(null);

        ListNode ge_2 = new ListNode(7);
        ListNode shi_2 = new ListNode(3);
//        ListNode bai_2 = new ListNode(7);

        ge_2.setNext(shi_2);
        shi_2.setNext(null);
//        bai_1.setNext(null);

        ListNode result = AddTwoNumbers.addTwoNumbers(ge_1, ge_2);

        ListNode temp = result.next;
        System.out.println(result.getVal());
        while(temp != null){
            System.out.println(temp.getVal());
            temp = temp.next;
        }
    }
}
