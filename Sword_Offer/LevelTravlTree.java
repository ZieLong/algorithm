package Sword_Offer;

import java.util.LinkedList;

/**
 * 层次遍历二叉树
 * 通过队列实现根节点入队列，出队列时访问，如果有左右孩子，则分别入队列
 */
public class LevelTravlTree {
    public void levelTraverse(TreeNode root) {
        if(root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
    }
}
