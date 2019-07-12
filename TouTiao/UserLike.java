package TouTiao;

import java.util.*;

/**
 * 输入： 第1行为n代表用户的个数 第2行为n个整数，第i个代表用户标号为i的用户对某类文章的喜好度
 * 第3行为一个正整数q代表查询的组数  第4行到第（3+q）行，每行包含3个整数l,r,k代表一组查询，
 * 即标号为l<=i<=r的用户中对这类文章喜好值为k的用户的个数。 数据范围n <= 300000,q<=300000 k是整型
 *注意查询次数很多，O(n)会超过限定时间
 * 算法思想：先将每一个k值对应的用户组成子序列，然后再对序列进行排序，最后二分查找
 */

public class UserLike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n ;++i) {
                arr[i] = scanner.nextInt();
            }
            Map<Integer,List<Integer>> map = new HashMap<>();
            for(int i = 0; i < n; ++i) {
                int key = arr[i];
                if(map.containsKey(key)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i + 1);
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(i + 1);
                    map.put(key,list);
                }
            }
            int q = scanner.nextInt();
            for (int i = 0; i < q; ++i) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int k = scanner.nextInt();
                int count = 0;
                List<Integer> list = map.get(k);
                if(list != null) {
                    for(int integer : list) {
                        if(integer >= l && integer <= r) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
            }
        }
    }

}

