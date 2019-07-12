package NetEase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 小易在学校中学习了关于字符串的理论, 于是他基于此完成了一个字典的项目。
 小易的这个字典很奇特, 字典内的每个单词都包含n个'a'和m个'z', 并且所有单词按照字典序排列。
 小易现在希望你能帮他找出第k个单词是什么。
 */
public class NaMz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long count = 0;
        List<String> list = new ArrayList<>();
        while(n > 0 && n > 0) {
            count = countSum(n - 1, m, k);
            if(count >= k) {
                list.add("a");
                n--;
            }else {
                list.add("z");
                m--;
                k -= count;
            }
        }
        if(k != 1) {
            System.out.println("-1");
            return;
        } else {
          while(n > 0) {
              list.add("a");
              n--;
          }
          while(m > 0) {
              list.add("z");
              m--;
          }
        }
        for(String i : list) {
            System.out.println(i);
        }

    }
    public static long countSum(int n, int m, int k) {
        if(m == 0 || n == 0) {
            return 1;
        }
        long sum = m + n;
        long count = 1;
        n = Math.min(m,n);
        for(int i = 0; i < n; i++) {
            count *= sum - i;
            count /= (i + 1);
            if(count > k) break;
        }
        return count;
    }
}
