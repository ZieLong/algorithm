package Sword_Offer;

import java.util.HashMap;

/**
 * 已知前序中序建立二叉树
 */
public class Build_binary_tree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if(pre == null || in == null) {
            return null;
        }
        /*
        借助HashHap快速找到位置
         */
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < in.length; i++) {
            map.put(in[i],i);
        }
        return preIn(pre,0,pre.length -1, in, 0, in.length -1, map);
    }

    public TreeNode preIn(int[] p, int pi, int pj, int[] n, int ni, int nj, HashMap<Integer,Integer> map) {
        if(pi > pj) {
            return null;
        }
        TreeNode head = new TreeNode(p[pi]);
        int index = map.get(p[pi]);
        head.left = preIn(p,pi + 1,pi + index - ni, n, ni, index -1, map);
        head.right = preIn(p ,pi + index - ni + 1, pj, n ,index + 1, nj, map);
        return head;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}