package Sword_Offer;

/**
 *数组中连续子向量的最大和
 */
public class FindGreatestSumOfSubArray {
    public int FindgreateSumOfSubArray(int[] array) {
        int sum = array[0]; //滑动窗口中的保留值，滑动窗口小于0时就抛弃，重新开始
        int sumset = array[0]; //存储最大值
        /*
        注意，并没有去判断array[i]的值的正负，而是判断一段子序列是否对最大和有贡献
         */
        for(int i = 1; i < array.length; i++) {
            if(sum < 0) {
                sum = array[i];
            } else {
                sum += array[i];
            }
            if(sumset < sum) {
                sumset = sum;
            }
        }
        return sumset;
    }
}
