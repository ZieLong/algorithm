package iqy;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 字符串中只保留第一次出现的字符
 */
public class Distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = 0; i < str.length(); ++i) {
            if(!hashSet.contains(str.charAt(i))) {
                hashSet.add(str.charAt(i));
                stringBuilder.append(str.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
