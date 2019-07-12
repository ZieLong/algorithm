package leetcode.deepSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 求出所有结果后继续求全排列数量
 */
public class CombinationSumIV {
    public static List<List<Integer>> ans1 = new ArrayList<>();
    public static List<Integer> list1 = new ArrayList<>();

    public static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<Integer> path = new ArrayList<>();
    public static List<Boolean> v = new ArrayList<>();

    public static void robot(int idx, int[] candidates, int resSum) {
        if(resSum == 0){
            ans1.add(new ArrayList<>(list1));
            return;
        }
        for(int i = idx; i < candidates.length; i++) {
            if(resSum < 0) {
                break;
            }
            list1.add(candidates[i]);
            robot(i, candidates, resSum - candidates[i]);
            list1.remove(list1.size() - 1);
        }
    }

    public int combinatiomSum4(int[] nums, int target) {
        Arrays.sort(nums);
        ans1.clear();
        robot(0, nums, target);
        for(List list01 : ans1){

        }
    }

    public static int robot1(int idx, List<Integer> lists) {
        if(idx >= lists.size()) {
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < lists.size(); ++i) {
                list.add(path.get(i));
            }
            ans.add(list);
            return ans.size();

        }
        for(int i = 0; i < lists.size(); ++i) {
            if(!v.get(i)) {
                path.set(idx,i);
                v.set(i,true);
                robot1(idx + 1, lists);
                v.set(i, false);
            }
        }
    }

}
