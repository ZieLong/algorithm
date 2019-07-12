package NetEase;

import java.util.Scanner;

public class Latern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            String s = scanner.next();
            int count = 0;
            for(int j = 0; j < m; j++) {
                if(s.charAt(j) == '.') {
                    count++;
                    j += 2;
                }
            }
            System.out.println(count);
        }
    }
}
