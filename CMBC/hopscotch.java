package CMBC;


import java.util.Scanner;

/**
 * 跳格子，上楼梯,递归即可
 * f(n) = f(n-1) + f(n-2)
 */
public  class hopscotch {
    public static int solution(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return solution(n -1) + solution(n -2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextInt()));
    }

}
