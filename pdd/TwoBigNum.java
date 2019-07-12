package pdd;

import java.util.Scanner;

public class TwoBigNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int[] ia = new int[a.length()];
        int[] ib = new int[b.length()];
        for (int i = 0; i < ia.length; i++) {
            ia[i] = a.charAt(i) - '0';
        }
        for (int i = 0; i < ib.length; i++) {
            ib[i] = b.charAt(i) - '0';
        }
        int[] result = new int[ia.length + ib.length];
        for(int i = 0; i < ia.length; i++) {
            for(int j = 0; j < ib.length; j++) {
                result[i + j] += ia[i] * ib[i];
            }
        }
        for(int i = result.length - 1; i > 0 ; i--){
            result[i - 1]  += result[i] / 10;
            result[i] = result[i] % 10;
        }
        StringBuffer str = new StringBuffer("");
        for (int i = 0; i < result.length - 1; i++) {
            str.append(result[i]);
        }
        System.out.println(str.toString());
    }
}
