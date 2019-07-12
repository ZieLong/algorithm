package Meituan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 给定一张包含N个点、N-1条边的无向连通图，节点从1到N编号，每条边的长度均为1。
 * 假设你从1号节点出发并打算遍历所有节点，那么总路程至少是多少？
 */
public class Travl_graph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> lists[] = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            lists[i] = new ArrayList();
        }
        for(int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            /*
            先判断list[i]是否有值
             */
            if(lists[i].get(lists[i].size() - 1) == a) {
                lists[i].add(b);
            }
        }
        int max = 0;
        for(int i = 1; i < n; i++) {
            if(max < lists[i].size()) {
                max = lists[i].size();
            }
        }
        System.out.println(2 * n - 2 - max);
    }
}
