package Sword_Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 有n个小朋友围成圈，从0开始，去掉第m-1个小朋友。然后m开始继续去掉m-1个小朋友。直到最后一个小朋友
 * 注意题目只是要返回最后一个小朋友的编号，不需要模拟整个游戏过程，所以需要一些数学技巧
 * 约瑟夫环问题是一个经典问题
 */
public class LastRemaining {
    public static int LastRemaining_Soution(int n, int m){
        if(n == 0 || m == 0) return -1;
        int del = 0;
        int k = m - 1;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n; i++) {
            list.add(i);
        }
        while(list.size() > 1) {
            del = (del + k) % list.size();
            list.remove(del);
        }
        return list.get(0);
    }

    /**
     * 解法二，使用约瑟夫公式
     * @param n
     * @param m
     * @return
     */
    public int solution2(int n, int m) {
        if(n == 0 || m == 0) return -1;
        int s = 0;
        for(int i = 2; i <= n; i++) {
            s = (s + m) % i;
        }
        return s;
    }
}
