package iqy;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 从DNA序列s中找出最短没有出现在DNA序列s中的DNA片段的长度。
 例如:s = AGGTCTA
 序列中包含了所有长度为1的('A','C','G','T')片段,但是长度为2的没有全部包含,例如序列中不包含"AA",所以输出2。
 这道题思想值得深思，跳出固定思维，反向思考
 */
public class DNASequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int j,i,n = str.length();

        for(i = 1; i <= n; i++) {
            HashSet<String> set = new HashSet<>();
            for(j = 0; j < n - i; j++) {
                set.add(str.substring(j,j + i));
            }

            if(set.size() < Math.pow(4,i)) {

                System.out.println(i);
                break;
            }
        }
    }
}
