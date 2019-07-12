package Sword_Offer;

/**
 * 判断t2树是否是t1树的子结构
 */
public class SubStructTree {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean res = false;
        if(root1 != null && root2 != null) {
            if(root1.val == root2.val) {
                res = check(root1,root2);
            }
            if(!res) {
                res = HasSubtree(root1.left,root2);
            }
            if(!res) {
                res = HasSubtree(root1.right,root2);
            }
            return res;
        }else {
            return false;
        }

    }

    public boolean check(TreeNode h, TreeNode root2) {
        if(root2 == null) {
            return true;
        }
        if(h == null || h.val != root2.val) {
            return false;
        }
        return check(h.left,root2.left) && check(h.right,root2.right);
    }
}
