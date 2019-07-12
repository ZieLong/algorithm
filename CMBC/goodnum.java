package CMBC;

import java.util.Scanner;

/**
 *判断一个数旋转180°是否仍然是一个数字，且和原数不相等
 */
public class goodnum {
    public static boolean isgoodnum(Integer n) {
       String s = n.toString();
       if(s.contains("3") || s.contains("4") || s.contains("7"))
           return false;
       if(s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")) {
           return true;
       }else {
           return false;
       }

    }
    public static void goodnum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isgoodnum(i)) count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        goodnum(scanner.nextInt());
    }

}
