package NetEase;

import java.util.Scanner;

/**
 * 小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
 1、将a_i放入b序列的末尾
 2、逆置b序列
 *小易需要你计算输出操作n次之后的b序列。
 * 算法思想：可以递归，也可以简单dp
 * 构造一个数组，array[n]为array[n-1]+n反转,字符串数组比较容易
 *
 * 上面方法会超过时间限制，所以需要找规律。
 */
public class Opera_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr_num = new int[n];
        for(int i = 0; i < n; i++) {
            arr_num[i] = scanner.nextInt();
        }
        for(int i = n - 1; i >= 0; i -= 2) {
            System.out.print(arr_num[i] + " ");
        }
        int start = 0;
        if(n % 2 == 1) start = 1;
        for(int i = start; i < n - 2; i += 2) {
            System.out.print(arr_num[i] + " ");
        }
        System.out.print(arr_num[n - 2]);
    }

}
