package leetcode;

/**
 * 归并排序单链表
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class linklistsort {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode midNext = mid.next;
        mid.next = null;
        return mergeSort(sortList((head)),sortList(midNext));

    }
    public ListNode getMid(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, quick = head;
        while(quick.next != null && quick.next.next != null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }
    public ListNode mergeSort(ListNode n1, ListNode n2) {
        ListNode preHead = new ListNode(0);
        ListNode cur1 = n1;
        ListNode cur2 = n2;
        ListNode cur = preHead;
        while(cur1 != null && cur2 != null) {
            if(cur1.val < cur2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
            }else {
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if(cur1 != null) {
            cur.next = cur1;
        }else if(cur2 != null) {
            cur.next = cur2;
        }
        return preHead.next;
    }
}
