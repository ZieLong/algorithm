package leetcode.deepSearch;
/**
 * leetcode_90 SubSets2
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> ans = new ArrayList<>();
    public static boolean[] v = new boolean[100]; //用来判断数组中哪个数位的值被使用过了

    public void robot(int idx, int[] nums) {
        if(idx >= nums.length) {
            //record ans
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                if(v[i]) {
                    list.add(nums[i]);
                }
            }
            ans.add(list);
            return;
        }
        if(idx > 0 && nums[idx - 1] == nums[idx] && !v[idx - 1]){
            v[idx] = false;
            robot(idx + 1, nums);
        }else {
            v[idx] = true;
            robot(idx + 1, nums);
            v[idx] = false;
            robot(idx + 1, nums);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.clear();
        Arrays.sort(nums);
        robot(0, nums);
        return ans;
    }

}
