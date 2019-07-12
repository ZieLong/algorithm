package Sword_Offer;

public class MergeListNode {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head = list1.val > list2.val ? list2 : list1;

        if(head == list1) {
            list1 = list1.next;
        }else {
            list2 = list2.next;
        }
        ListNode p = head;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                p.next = list1;
                p = p.next;
                list1 = list1.next;
            }else {
                p.next = list2;
                p = p.next;
                list2 = list2.next;
            }
        }
        if(list1 == null) p.next = list2;
        if(list2 == null) p.next = list1;
        return head;
    }
}
