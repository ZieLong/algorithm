package Sort;

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，
 * 序列间按照开始数字从小到大的顺序
 */
public class Countinuous_nums {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if(sum < 3) return lists;
        for(int i = 1; i <= (sum/2) + 1; i++) {
            int num = 0;
            for(int j = i; j <= (sum/2) + 1; j++) {
                num += j;
                if(sum == num) {
                    ArrayList<Integer> list= new ArrayList<>();
                    for(int k = i; k <= j; k++) {
                        list.add(k);
                    }
                    lists.add(list);
                }
            }
        }
        return lists;
    }
}
