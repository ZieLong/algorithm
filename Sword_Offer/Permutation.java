package Sword_Offer;

import java.util.Scanner;

/**
 * 给定字符串，得到该字符串的全排列
 */
public class Permutation {
    public static void paiLie(int n, char[] chars) {
        if(n == chars.length -1) {
            System.out.println(String.valueOf(chars));
        } else {
            char exchange;
            for(int i = n; i < chars.length; i++) {
                exchange = chars[i];
                chars[i] = chars[n];
                chars[n] = exchange;
                paiLie(n + 1, chars);
                /*
                递归后要恢复原来的数组
                 */
                exchange = chars[i];
                chars[i] = chars[n];
                chars[n] = exchange;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] chars = str.toCharArray();
            paiLie(0,chars);
        }
    }


}
