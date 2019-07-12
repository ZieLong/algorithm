package NetEase;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 彩色砖块2018年秋招笔试
 * 思路，超过两种颜色以上的就不符合
 * 所以只需要判断有多少种颜色就行
 */
public class Color_fragment {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        if(set.size() == 1) {
            System.out.println("1");
        }else if(set.size() == 2) {
            System.out.println("2");
        }else {
            System.out.println("0");
        }
    }
}
