package NetEase;

import java.util.Scanner;

/**
 * 判断最多又多少个矩形重叠
 */
public class OverlapRect {
    /**

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] y2 = new int[n];
        int[] x2 = new int[n];
        for(int i = 0; i < n; i++) {
            x1[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            y1[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            x2[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            y2[i] = scanner.nextInt();
        }
        int count = 0;
        int ans = 0;
        for(int x : x1) {
            for(int y : y1) {
                for(int i = 0; i < n; i++) {
                    if(x > x1[i] && x < x2[i] && y > y1[i] && y < y2[i]) {
                        count++;
                    }
                }
                if(count > ans) {
                    ans = count;
                }
                count = 0;
            }
        }
    }
}
