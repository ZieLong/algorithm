package Sword_Offer;

import java.util.HashMap;

/**
 * 复制一个复杂链表
 * 链表中有两个指针，一个指向下一个节点，一个指向随机节点
 */
public class CopyComplexLinkList {
    /**
     * hashMap方法，使用hashMap,key存储原始节点，value存储新生成的节点一一对应。
     * @param pHead
     * @return
     */
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) {
            return null;
        }
        RandomListNode p = pHead;
        RandomListNode head = new RandomListNode(-1);
        RandomListNode q = head;
        HashMap<RandomListNode,RandomListNode> hashMap = new HashMap<>();
        while (p != null) {
            RandomListNode temp = new RandomListNode(p.label);
            hashMap.put(p,temp);
            q.next = temp;

            q = q.next;
            p = p.next;
        }
        p = pHead;
        while (p != null) {
            if(p.random != null) {
                RandomListNode value = hashMap.get(p);
                RandomListNode random = hashMap.get(p.random);
                value.random = random;
            }
            p = p.next;
        }
        return head.next;
    }

    /**
     * 不使用额外空间，没产生一个新的节点就接在元节点之后，然后奇偶分裂成两个链表
     * @param pHead
     * @return
     */
    public RandomListNode Clone2(RandomListNode pHead) {
        if(pHead == null) {
            return null;
        }
        RandomListNode p = pHead;
        while(p != null) {
            RandomListNode temp = new RandomListNode(p.label);
            temp.next = p.next;
            p.next = temp;

            p = temp.next;
        }
        /*
        复制random指针
         */
        p = pHead;
        while(p != null) {
            if(p.random != null) {
                p .next.random = p.random.next;
            }
            p = p.next.next;
        }
        /*
        拆分链表
         */
        RandomListNode head = p.next;
        RandomListNode q = head;
        p = pHead;
        while(q.next != null) {
            p.next = q.next;
            p = p.next;

            q.next = p.next;
            q = q.next;
        }
        p.next = null;
        return head;
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}