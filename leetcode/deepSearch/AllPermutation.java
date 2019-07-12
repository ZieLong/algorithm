package leetcode.deepSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * 深度遍历思想
 * 给定数组，求出该数组的全排列
 */
public class AllPermutation {
    //用来存答案
    public static List<List<Integer>> ans = new ArrayList<>();
    //用来存储每一个答案路径
    public static int[] path = new int[100];
    //判断路径上的元素是否使用过
    public static boolean[] v = new boolean[100];

    public static void robot(int idx, int[]nums) {
        if(idx >= nums.length) { //递归结束条件
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i< nums.length; i++) {
                list.add(nums[path[i]]);
            }
        }
        for(int i = 0; i < nums.length; ++i) {
            if(v[i] == false) {
                path[idx] = i;
                v[i] = true;
                robot(idx + 1, nums);
                v[i] = false;
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        robot(0,nums);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
