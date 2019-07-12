package NetEase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 网易2019年题
 * 注意并不是能力越高报酬越高
 *
 *
 * 自己的代码，循环体过多，不能在规定时间内结束
 */
public class FindJob {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); //工作数量
//        int m = sc.nextInt(); //小伙伴数量
//        int[] job_arr = new int[n];
//        int[] man_arr = new int[m];
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < n; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            job_arr[i] = a;
//            map.put(a, b);
//        }
//        for(int i = 0; i < m; i++) {
//            man_arr[i] = sc.nextInt();
//        }
//        Arrays.sort(job_arr);
//        for(int i = 0; i < m; i++) {
//            int res = 0;
//            for(int j = 0; j < n; j++) {
//                if(man_arr[i] >= job_arr[j]) {
//                    res = Math.max(map.get(job_arr[j]),res);
//                }
//            }
//            System.out.println(res);
//        }
//    }


    /**
     * 牛客思路
     * 将人的能力和工作需要能力放在一个数组中，进行排序，然后hash
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int t1 = 0; int t2 = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = new int[M + N];
        int[] b = new int[M];
        for(int i = 0; i < N; i++) {
            t1 = sc.nextInt();
            t2= sc.nextInt();
            a[i] = t1;
            map.put(t1, t2);
        }
        for(int i = 0 ; i < M; i++) {
            t1 = sc.nextInt();
            a[N + i] = t1;
            b[i] = t1;
            if(!map.containsKey(t1)) {
                map.put(t1,0);
            }
        }
        Arrays.sort(a);
        int max = 0;
        for(int i = 0; i < M + N; i++) {
            max = Math.max(max,map.get(a[i]));
            map.put(a[i],max);
        }
        for(int i = 0; i< M; i++) {
            System.out.println(map.get(b[i]));
        }
    }

}
