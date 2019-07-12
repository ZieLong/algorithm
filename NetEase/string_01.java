package NetEase;

import java.util.Scanner;

/**
 * 在01串中找出最长01交错串
 */
public class string_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int num = 1;
        int max = 1;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) !=  str.charAt(i + 1)) {
                num++;
                if(i + 1 == str.length() - 1) {
                    max = Math.max(max,num);
                }
            } else {
                max = Math.max(max,num);
                num = 1;
            }

        }
        System.out.println(max);
    }
}
