package Sword_Offer;

import java.util.LinkedList;

public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        int left = TreeDepth(root.left) + 1;
        int right = TreeDepth(root.right) + 1;
        return left > right ? left : right;
    }

    /**
     * 非递归
     * @param root
     * @return
     */
    public int TreeDepth01(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        if(root == null) return 0;
        list.push(root);
        int level = 0;
        while(!list.isEmpty()) {
            int len = list.size();
            level++;
            while(len != 0) {
                TreeNode tmp = list.peek();
                list.pop();
                len--;
                if(tmp.left != null) list.push(tmp.left);
                if(tmp.right != null) list.push(tmp.right);
            }

        }
        return level;
    }
}
