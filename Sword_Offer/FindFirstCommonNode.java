package Sword_Offer;

/**
 * 输入两个链表，找出他们的第一个公共节点
 * 长的链表先后移长度差个节点
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) {
            return null;
        }
        int length1 = 0, length2 = 0;
        ListNode p1 = pHead1, p2 = pHead2;
        while (p1 != null) {
            length1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            length2++;
            p2 = p2.next;
        }
        if(length1 > length2) {
            for(int i = 0; i < length1 - length2; i++) {
                pHead1 = pHead1.next;
            }
        }else if(length2 > length1) {
            for(int i = 0; i < length2 - length1; i++) {
                pHead2 = pHead2.next;
            }
        }
        while(pHead1 != null && pHead2 != null) {
            if(pHead1 == pHead2) {
                return pHead1;
            } else {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }

        }
        return null;
    }
}
