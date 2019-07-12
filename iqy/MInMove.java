package iqy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 牛牛有一个长度为n的整数序列,牛牛想对这个序列进行重排为一个非严格升序序列。
 * 牛牛比较懒惰,他想移动尽量少的数就完成重排,
 * 请你帮他计算一下他最少需要移动多少个序列中的元素。(当一个元素不在它原来所在的位置,这个元素就是被移动了的)
 */
public class MInMove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array1 = new int[a];
        int[] array2 = new int[a];
        for(int i = 0; i < a; i++) {
            array1[i] = scanner.nextInt();
            array2[i] = array1[i];
        }
        Arrays.sort(array1);
        int count = 0;
        for(int i = 0; i < a; i++) {
            if(array1[i] != array2[i]) count++;
        }
        System.out.println(count);
    }

}
