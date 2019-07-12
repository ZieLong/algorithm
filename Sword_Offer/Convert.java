package Sword_Offer;

import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {
            return null;
        }
        TreeNode head = pRootOfTree;
        TreeNode pre = null;
        TreeNode cur = null;
        boolean isFirst = true;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || head != null) {
            if(head != null) {
                stack.push(head);
                head = head.left;
            }else {
                head = stack.pop();
                if(isFirst) {
                    pre = head;
                    cur = head;
                    isFirst = false;
                } else {
                    pre.right = head;
                    head.left = pre;
                    pre = head;
                }
                head = head.right;
                }
            }
        return cur;
    }

    /**
     * 递归实现
     *
     */
    public TreeNode Convert01(TreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right ==null) return root;
        TreeNode left = Convert01(root.left);
        TreeNode p = left;
        while(p != null && p.right != null) {
            p = p.right;
        }
        if(left != null) {
            p.right = root;
            root.left = p;
        }
        TreeNode right = Convert01(root.right);
        if(right != null) {
            right.left = root;
            root.right = right;
        }
        return left != null ? left : root;
     }
}
