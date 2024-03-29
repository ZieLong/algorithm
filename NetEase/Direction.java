package NetEase;

import java.util.Scanner;

/**
 * 牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。
 * 虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
 *
 * 每个输入包含一个测试用例。
 每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
 接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。

 输出牛牛最后面向的方向，N表示北，S表示南，E表示东，W表示西。
 */
public class Direction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int lNum = 0;
        int rNum = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') {
                lNum++;
            } else{
                rNum++;
            }
        }
        int dis = lNum - rNum > 0 ? lNum - rNum : rNum - lNum;
        if(dis == 0) {
            System.out.println("N");
            return;
        }
        int remain = dis % 4;
        switch (remain) {
            case 0:
                System.out.println("N");
                break;
            case 1:
                if(lNum > rNum) {
                    System.out.println("W");
                }else {
                    System.out.println("E");
                }
                break;
            case 2:
                System.out.println("S");
                break;
            case 3:
                if(lNum > rNum) {
                    System.out.println("E");
                }else {
                    System.out.println("W");
                }
                break;
        }
    }
}
