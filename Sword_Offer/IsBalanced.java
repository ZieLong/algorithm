package Sword_Offer;

/**
 * 判断一棵二叉树是否是平衡二叉树
 */

public class IsBalanced {
    /**
     * 递归实现
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = GetTreeDepth(root.left);
        int right = GetTreeDepth(root.right);
        int diff = left - right;

        if(diff > 1 || diff < -1) return false;

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    public int GetTreeDepth(TreeNode root) {
        if(root == null) return 0;
        int left = GetTreeDepth(root.left) + 1;
        int right = GetTreeDepth(root.right) + 1;
        return left > right ? left : right;
    }


    public boolean IsBanlanceTree(TreeNode root) {
        int depth = 0;
        return IsBanlanceTreeCore(root,depth);
    }

    private static boolean IsBanlanceTreeCore(TreeNode root,int depth) {
        if(root == null) {
            depth = 0;
            return true;
        }
        int left = 0;
        int right = 0;
        if(IsBanlanceTreeCore(root.right,left) && IsBanlanceTreeCore(root.right,right)) {
            int diff = left - right;
            if(diff >= -1 && diff <= 1) {
                depth = left >= right ? left + 1 : right + 1;
                return true;
            }
        }
        return false;
    }
}
