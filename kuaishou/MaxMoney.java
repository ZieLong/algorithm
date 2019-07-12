package kuaishou;

import java.util.Scanner;

/**
 * 举例解释：桌子上放了红包  1, 2, 3, 4, 7, 10。小明在“4,7”之间、
 * “7,10” 之间各切一刀，将红包分成3组 [1, 2, 3, 4]   [7]   [10]，
 * 其中第一组奖金之和=第三组奖金之和=10，所以小明可以拿到10越南盾。
 *
 * 思路：首尾指针向中间移动，数额小的移动，数额一样同时移动，直到中间剩一个（基数）或两个（偶数）
 */
public class MaxMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 2) {
            System.out.println(0);
            return;
        }
        int[] money = new int[n];
        for(int i = 0; i < n; ++i) {
            money[i] = scanner.nextInt();
        }
        int left = 0;
        int right = n - 1;
        long leftsum = money[0], rightSum = money[n - 1];
        long max = 0;
        while(right > left) {
            if(leftsum > rightSum) {
                rightSum += money[--right];
            }else if(leftsum < rightSum){
                leftsum += money[++left];
            }else {
                max = leftsum;
                rightSum += money[--right];
                leftsum += money[++left];
            }
        }
        System.out.println(max);
    }

}
