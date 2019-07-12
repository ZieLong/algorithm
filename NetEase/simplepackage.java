package NetEase;

import java.util.Scanner;

/**
 * 背包问题变体：
 * 牛牛准备参加学校组织的春游, 出发前牛牛准备往背包里装入一些零食, 牛牛的背包容量为w。
 牛牛家里一共有n袋零食, 第i袋零食体积为v[i]。
 牛牛想知道在总体积不超过背包容量的情况下,他一共有多少种零食放法(总体积为0也算一种放法)。
 输入包括两行
 第一行为两个正整数n和w(1 <= n <= 30, 1 <= w <= 2 * 10^9),表示零食的数量和背包的容量。
 第二行n个正整数v[i](0 <= v[i] <= 10^9),表示每袋零食的体积。

 */
public class simplepackage {
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] v = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
            sum += v[i];
        }
        if(sum < w) {
            System.out.println((int)Math.pow(2, n));
        } else {
            dfs(0, 0, n, v, w);
            System.out.println(count + 1);
        }

    }
    private static void dfs(long sum, int cur, int n, int[] nums, int total) {
        if(cur < n) {
            if(sum > total) {
                return;
            }
            //不添加当前零食
            dfs(sum, cur + 1, n, nums, total);
            //当前零食添加方式合理，添加当前零食
            if(sum + nums[cur] <= total) {
                count++;
                dfs(sum + nums[cur], cur + 1, n, nums, total);
            }
        }
    }
}
