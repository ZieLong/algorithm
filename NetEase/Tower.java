package NetEase;

import java.util.Scanner;

/**
 * 小易有一些立方体，每个立方体的边长为1，他用这些立方体搭了一些塔。
 现在小易定义：这些塔的不稳定值为它们之中最高的塔与最低的塔的高度差。
 小易想让这些塔尽量稳定，所以他进行了如下操作：每次从某座塔上取下一块立方体，并把它放到另一座塔上。
 注意，小易不会把立方体放到它原本的那座塔上，因为他认为这样毫无意义。
 现在小易想要知道，他进行了不超过k次操作之后，不稳定值最小是多少。
 */
public class Tower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] tower = new int[n];
        for(int i = 0; i < n; i++) {
            tower[i] = scanner.nextInt();
        }

    }
}
