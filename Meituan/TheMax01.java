package Meituan;

import java.util.Scanner;

/**
 * 动态滑动窗口，思想值得深思，很精妙
 */
public class TheMax01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i < n; i++) {
            str.append(scanner.nextInt());
        }
        String s = str.toString();
        System.out.println(Max11(s,k));
    }
    public static int Max11(String s, int k) {
        int left = 0, right = 0, res = 0, change = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                right++;
            } else {
                if(change < k) {
                    change++;
                    right++;
                }else {
                    //left <= right,注意k=0的情况
                    while(left <= right && s.charAt(left) == '1') left++;
                    left++;
                    right++;
                }
            }
            res = Math.max(res,right - left);
        }
        return 0;
    }
}
