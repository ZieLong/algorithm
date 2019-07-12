package NetEase;
/**
 * 最晚起床时间
 */

import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hour = new int[n];
        int[] minute = new int[n];
        for(int i = 0; i < n; i++) {
            hour[i] = sc.nextInt();
            minute[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int hTime = sc.nextInt();
        int mTime = sc.nextInt();
        int count = -1;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(hour[i] * 60 + minute[i] + x <= hTime * 60 + mTime){
                max = Math.max(hour[i] * 60 + minute[i], max);
            }
        }
        int h = max / 60;
        int m = max % 60;
        System.out.println(h + " " + m);
    }
}
