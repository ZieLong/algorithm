package Sword_Offer;

/**
 * 求1+2+3+...+n，
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Sum_Solution {
    public static int Sum_Solution(int n) {
        if(n == 1) return n;
        return n + Sum_Solution(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(5));
    }
}
