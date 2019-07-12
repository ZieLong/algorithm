package dp_recuision;

/**
 * 非递归求斐波拉契
 */
public class Fibonacci {
    public int f2(int n) {
        if (n < 1) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        int res = 1;
        int pre = 1;
        int tmp;
        for (int i = 3; i <= n; i++) {
            tmp = res;         //使用tmp来保存pre
            res = res + pre;  //当前值为，res + pre
            pre = tmp;        //保存当前值赋给下一个pre

        }
        return res;
    }
}
