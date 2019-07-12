package NetEase;

import java.util.*;

/**
 * 判断一个数组是否能组成等差数列
 * 排序就好了
 */
public class arithmetic_progression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int dis = arr[1] - arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] != dis) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
