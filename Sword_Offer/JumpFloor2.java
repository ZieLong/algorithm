package Sword_Offer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 *思路：F(N) = F(N-1) + F(N-2) + ... + F(1) + 1
 */
public class JumpFloor2 {
    public static int JumpFloorII(int target) {
        if (target == 1) return 1;
        if (target == 2) return 2;
        int sum = 1;
        while(target > 1) {
            sum += JumpFloorII(target - 1);
            target--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(JumpFloorII(n));
    }
}
