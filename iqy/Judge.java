package iqy;

import java.util.Scanner;

/**
 * 牛牛参加了一场考试,考试包括n道判断题,
 * 每做对一道题获得1分,牛牛考试前完全没有准备,
 * 所以考试只能看缘分了,牛牛在考试中一共猜测了t道题目的答案是"正确",其他的牛牛猜为"错误"。
 * 考试结束后牛牛知道实际上n道题中有a个题目的答案应该是"正确",但是牛牛不知道具体是哪些题目,
 * 牛牛希望你能帮助他计算可能获得的最高的考试分数是多少。
 *
 * 关键点：最多分为总题数减去答对题和正确题的差值
 */
public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int m = a - t > 0 ? a - t : t - a;
        System.out.println(n - m);
    }
}
