package Sword_Offer;

/**
 * 反转链表
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head != null) {
            next = head.next;
            head.next = pre; // 注意此处
            pre= head;
            head = next;
        }
        return pre;
    }
}
