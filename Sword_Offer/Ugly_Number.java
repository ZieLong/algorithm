package Sword_Offer;

/**
 * 只包含2，3，5质因数的数称为丑数，求出第N个丑数
 */
public class Ugly_Number {
    public int GetUglyNumber_solution(int index) {
        if(index < 7) return index;
        int[] res = new int[index];
        int i2 = 0, i3 = 0, i5 = 0;
        res[0] = 1;
        for(int i = 1; i < index; ++i) {
            res[i] = min(res[i2] * 2, min(res[i3] * 3, res[i5] * 5));
            if(res[i] == res[i2] * 2) i2++;
            if(res[i] == res[i3] * 3) i3++;
            if(res[i] == res[i5] * 5) i5++;
        }
        return res[index - 1];
    }
    private int min(int a, int b) {
        return (a > b) ? b : a;
    }
}
