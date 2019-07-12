package BinaryTree;

/**
 * 递归遍历
 */
public class OrderRecur {
    /*
    先序遍历
     */
    public void preOrderRecur(Node head) {
        if(null == head) return;
        System.out.println("->" + head.value); //遍历
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    /*
    中序遍历
     */
    public void inOrderRecur(Node head) {
        if(head == null) return;
        inOrderRecur(head.left);
        System.out.println("->" + head.value);
        preOrderRecur(head.right);
    }

    /*
    后序遍历
     */
    public void posOrderRecur(Node head) {
        if(head == null) return;
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println("->" + head.value);
    }
}
