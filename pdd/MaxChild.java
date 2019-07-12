package pdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 六一儿童节，老师带了很多好吃的巧克力到幼儿园。每块巧克力j的重量为w[j]，
 * 对于每个小朋友i，当他分到的巧克力大小达到h[i] (即w[j]>=h[i])，他才会上去表演节目。
 * 老师的目标是将巧克力分发给孩子们，使得最多的小孩上台表演。可以保证每个w[i]> 0
 * 且不能将多块巧克力分给一个孩子或将一块分给多个孩子。
 *
 *
 * 注意：有可能小朋友比糖果数量少
 *
 */
public class MaxChild {
    public static void main(String[] args) {
        solution();
    }
    public static int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> child = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            child.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> sugar = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            sugar.add(sc.nextInt());
        }
        if(n == 0 || m ==0) {
            return 0;
        }
        Collections.sort(child);
        Collections.sort(sugar);
        int res = 0;
        for(int i = 0,j = 0; i < n && j < m;) {
            if(child.get(i) <= sugar.get(j)) {
                i++;
                j++;
                res++;
            }else {
                j++;
            }
        }
        return res;
    }
}
