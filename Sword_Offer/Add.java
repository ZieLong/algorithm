package Sword_Offer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Add {
    public int Add(int num1, int num2) {
        int CF = (num1 & num2) << 1;
        num1 ^= num2;
        while(0 != CF) {
            num2 = CF;
            CF = (num1 & num2) << 1;
            num1 ^= num2;
        }
        return num1;
    }
}
