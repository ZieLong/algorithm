package NetEase;

import java.util.Scanner;

/**
 * 小易觉得高数课太无聊了，决定睡觉。不过他对课上的一些内容挺感兴趣，
 * 所以希望你在老师讲到有趣的部分的时候叫醒他一下。你知道了小易对一堂课每分钟知识点的感兴趣程度，
 * 并以分数量化，以及他在这堂课上每分钟是否会睡着，
 * 你可以叫醒他一次，这会使得他在接下来的k分钟内保持清醒。你需要选择一种方案最大化小易这堂课听到的知识点分值。
 * 注意是叫醒一次
 *
 * 思路分析：使用滑动窗口法，反推分析，叫醒时得到的分数最高，则总结果就是最高
 */
public class MaxScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a[] = new int[n];
        int t[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        int change = 0;
        int maxChange = 0;
        for(int i = 0; i < n; ++i) {
            if(t[i] == 1) {
                sum1 += a[i];
            }
            sum2 += a[i];
        }
        if(k >= n) {
            System.out.println(sum2);
            return;
        }else {
            int left = 0;
            int right = 0;
            while(right <= k - 1){
                right++;
                if(t[right] == 0) {
                    change += a[right];
                }
            }
            while(right < n - 1) {
                right++;
                left++;
                if(t[right] == 0) change += a[right];
                if(t[left] == 0) change -= a[left];
                maxChange = Math.max(change, maxChange);
            }
            System.out.println(sum1 + maxChange);
        }

    }
}
