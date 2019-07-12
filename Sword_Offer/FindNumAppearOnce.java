package Sword_Offer;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class FindNumAppearOnce {
    public void FindNumsAppearOnce(int[] array, int [] num1, int num2[]) {
        if(array.length < 2) return ;
        int res = 0;
        for(int i = 0; i < array.length; i++) {
            res ^= array[i];
        }
        int bitIndex = 0;
        for(int i = 0; i < 32; i++) {
            if((res >> i & 1) == 1) {
                bitIndex = i;
                break;
            }
        }
        for(int i = 0; i < array.length; i++) {
            if((array[i] >> bitIndex & 1) == 1)
                num1[0] ^= array[i];
            else num2[0] ^= array[i];
        }
    }
}
