package Sword_Offer;

/**
 * 奇数放左边，偶数放右边
 * 不能改变原数组元素的相对位置
 *
 *可以改变相对位置的话就采用快排的partition思想
 * 不能改变就采用冒泡思想
 */
public class odd_and_even {
    public void reOrderArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }
}
