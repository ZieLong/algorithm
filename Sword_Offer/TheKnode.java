package Sword_Offer;

public class TheKnode {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p = head;
        ListNode q = head;
        int length = 0;
        while(head!= null) {
            length++;
            head = head.next;
        }
        for(int count = 0; count < k - 1; count++) {
            q = q.next;
        }
        while(q.next != null) {
            p = p.next;
            q= q.next;
        }
        return p;
    }
}
class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}