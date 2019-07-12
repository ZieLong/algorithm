package leetcode.deepSearch;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    public static int[] path = new int[100];
    public static List<List<Integer>> ans = new ArrayList<>();
    public static int K;
    public static void robot(int idx, int n, int k) {
        if(k == 0) {
            //record ans
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < K; ++i) {
                list.add(path[i]);
                sum += path[i];
            }
            if(sum == n) {
                ans.add(list);
            }
            return;
        }
        for(int i = idx + 1; i <= 9; ++i) {
            path[k - 1] = i;
            robot(i, n, k - 1);
        }
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        ans.clear();
        K = k;
        robot(0, n, k);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7).size());
    }
}
