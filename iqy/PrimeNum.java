package iqy;

import java.util.Scanner;

/*
如果一个整数只能被1和自己整除,就称这个数是素数。
如果一个数正着反着都是一样,就称为这个数是回文数。例如:6, 66, 606, 6666
如果一个数字既是素数也是回文数,就称这个数是回文素数
牛牛现在给定一个区间[L, R],希望你能求出在这个区间内有多少个回文素数
 */
public class PrimeNum {
    public static boolean isPrimeNum(int num) {
        for(int i = 2; i <= Math.sqrt(num); i ++) {
            if(num % i == 0)return false;
        }
        return true;
    }
    public static boolean isPlalindrome(int num) {
        String str = num + "";
        for(int i = 0; i < str.length() / 2; i ++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = a > 2 ? a : 2; i <= b; i++) { //注意1不是素数
            if(isPrimeNum(i) && isPlalindrome(i))
                System.out.println(i);
                count++;
        }
        System.out.println(count);
    }

}
