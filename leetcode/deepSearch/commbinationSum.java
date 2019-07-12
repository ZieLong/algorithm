package leetcode.deepSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class commbinationSum {
    public static List<List<Integer>> ans = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();
    public static void robot(int idx, int[] candidates, int resSum) {
        if(resSum == 0){
                ans.add(new ArrayList<>(list));
                return;
            }
        for(int i = idx; i < candidates.length; i++) {
            if(resSum < 0) {
                break;
            }
            list.add(candidates[i]);
            robot(i, candidates, resSum - candidates[i]);
            list.remove(list.size() - 1);
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        ans.clear();
        robot(0, candidates, target);
        return ans;
    }
}
