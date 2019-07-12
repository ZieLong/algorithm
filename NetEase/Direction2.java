package NetEase;

import java.util.Scanner;

/**
 * 牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。
 但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。
 牛牛希望你能帮他计算一共有多少个可能的数对。
 */
public class Direction2 {
    /**
     * O(n^2)明显超出时间限制
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int count = 0;
//        for(int i = k + 1; i <= n; i++) {
//            for(int j = k; j <= n; j++) {
//                if(j % i >= k) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }


    /**
     * 改进版
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = 0;//x循环节之外的
        long sum = 0;
        if(k == 0) {
            System.out.println(n * n);
            return;
        }
        for(int i = k + 1; i <= n; i++) {
            t = (n % i - k + 1) > 0 ? (n % i - k + 1) : 0;
            sum += n / i *(i - k) + t;
        }
        System.out.println(sum);
    }
}
