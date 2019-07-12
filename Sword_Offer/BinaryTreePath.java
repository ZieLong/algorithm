package Sword_Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 得到二叉树的每一条路径
 */
public class BinaryTreePath {
    private void serachBT(TreeNode root, String path, List<String> answer) {
        if(root.left == null && root.right == null) answer.add(path + root.val);
        if(root.left != null) serachBT(root.left,path + root.val + "-",answer);
        if(root.right != null) serachBT(root.right,path + root.val + "-",answer);
    }

    private List<List<Integer>> getList(List<String> list) {
        if(list == null) return null;
        List<List<Integer>> result = new ArrayList<>();
        for(String s : list) {
            List<Integer> list1 = new ArrayList<>();
            for(int k = 0; k < s.length(); k++) {
                if(s.charAt(k) != '-') {
                    list1.add(s.charAt(k) - '1' + 1);
                }
            }
            result.add(list1);
        }
        return result;
    }
}
