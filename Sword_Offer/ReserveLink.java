package Sword_Offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 *sort list
 */
public class ReserveLink {
    public ArrayList<Integer> printListFromToHead(ListNode listNode)
    {
        ArrayList<Integer> listNodeList = new ArrayList<>();
        while(listNode != null){
            listNodeList.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(listNodeList);
        return listNodeList;
    }

}
