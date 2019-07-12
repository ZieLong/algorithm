package Sword_Offer;

import java.util.ArrayList;

/**
 * 找到二叉树中路径和为target的所有路径
 */
public class FindPath {
    public static ArrayList<Integer> change(ArrayList<TreeNode> arrayList) {
        ArrayList<Integer> res = new ArrayList<>();
        for(TreeNode t : arrayList) {
            res.add(t.val);
        }
        return res;
    }
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<TreeNode> onePath = new ArrayList<>();
    int sum = 0;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return result;
        sum += root.val;
        onePath.add(root);
        if(root.left == null && root.right == null) {
            if(target == sum) {
                result.add(change(onePath));
            }
        }
        if(root.left != null) {
            FindPath(root.left,target);
        }
        if(root.right != null) {
            FindPath(root.right,target);
        }
        onePath.remove(root);
        sum -= root.val;
        return result;
    }
}
