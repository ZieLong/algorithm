package Sword_Offer;

public class MirrorTree {
    public void Mirror(TreeNode root) {
        if(root != null) {
            TreeNode t;
            t = root.left;
            root.left = root.right;
            root.right = t;
            if(root.left != null) Mirror(root.left);
            if(root.right != null) Mirror(root.right);
        }
    }
}
