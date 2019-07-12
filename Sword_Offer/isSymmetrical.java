package Sword_Offer;

/**
 * 判断二叉树是否对称
 * 注意：对称是左子树的右孩子和右子树的左孩子对称
 */
public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) return true;
        return comRoot(pRoot.left, pRoot.right);
    }
    private boolean comRoot(TreeNode left, TreeNode right) {
        if(left == null) return right == null;
        if(right == null) return false;
        if(left.val != right.val) return false;
        return comRoot(left.right, right.left) && comRoot(left.left, right.right);
    }
}
