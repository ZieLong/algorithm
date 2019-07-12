package kuaishou;

import java.util.Arrays;

/**
 * 小明有一袋子长方形的积木，如果一个积木A的长和宽都不大于另外一个积木B的长和宽，则积木A可以搭在积木B的上面。
 * 好奇的小明特别想知道这一袋子积木最多可以搭多少层，你能帮他想想办法吗？
 定义每一个长方形的长L和宽W都为正整数，并且1 <= W <= L <= INT_MAX, 袋子里面长方形的个数为N, 并且 1 <= N <= 1000000.
 */
public class JiMu {
    public static void main(String[] args) {
        int[][] arr = {{2,2}, {2,4}, {3,3}, {2,5},{4,5}};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
