package iqy;

import java.util.Scanner;

/**
 * 对于任意两个正整数x和k,我们定义repeat(x, k)
 * 为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),
 请你来比较v1和v2的大小。
 */
public class ReNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int k2 = scanner.nextInt();

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i = 0; i < k1; i++) {
            str1.append(x1);
        }
        for(int i = 0; i < k2; i++) {
            str2.append(x2);
        }
        if(str1.length() > str2.length()) {
            System.out.println("Greater");
        } else if(str1.length() < str2.length()) {
            System.out.println("Less");
        } else {
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) - str2.charAt(i) > 0) {
                    System.out.println("Greater");
                    return;
                } else if(str1.charAt(i) - str2.charAt(i) < 0) {
                    System.out.println("Less");
                    return;
                }
            }
            System.out.println("Equal");
        }
    }
}
