package leetcode.deepSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定数组，任取n个元素的组合的所有取值结果
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 */
public class AllSet {

    public static List<List<Integer>> ans = new ArrayList<>();
    public static int[] path = new int[100];
    public static int K = 0;

    public void robot(int idx, int n ,int k) { //idx[0, n] 表示搜索的当前搜索的数字，后续只能在idx基础上增加。
        if(k == 0) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < K; i++) {
                list.add(path[i]);
            }
            ans.add(list);
            return;
        }
        for(int i = idx + 1; i <= n; ++i) { //for的宏观意义，下一层递归的搜索范围
            path[k - 1] = i;
            robot(i, n , k - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        ans.clear();
        K = k;
        robot(0, n, k);
        return ans;
    }
}
