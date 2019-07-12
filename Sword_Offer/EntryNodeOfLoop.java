package Sword_Offer;

import java.util.HashSet;
import java.util.Set;

public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null) return null;
        Set<ListNode> set= new HashSet<>();
        while(pHead.next != null) {
            if(set.contains(pHead.next)) return pHead.next;
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
}
