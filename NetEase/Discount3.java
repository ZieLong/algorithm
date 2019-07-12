package NetEase;

import java.util.Scanner;

/**
 * 小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。
 并且小Q对于能否被3整除这个性质很感兴趣。
 小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
 */
public class Discount3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int num = end - start + 1;
        int a = 2 * (num / 3);
        int b = num % 3;
        int startNum = 0;
        for(int i = 1; i <= start; i++) {
            startNum = startNum * 10 + i;
        }
        if(startNum % 3 != 0){
            if(b == 0) {
                System.out.println(a);
            }else if(b == 1) {
                System.out.println(a);
            } else {
                System.out.println(a + 1);
            }
        }else if(start % 3 != 0) {
            if(b == 1) {
                System.out.println(a + 1);
            } else if(b == 2) {
                System.out.println(a + 2);
            } else {
                System.out.println(a);
            }
        }else {
            if(b == 0) {
                System.out.println(a);
            }else if(b == 1) {
                System.out.println(a + 1);
            }else {
                System.out.println(a + 1);
            }
        }
    }
}
