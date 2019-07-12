package Sword_Offer;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,
 * 求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 *
 * 思路:归并排序的变体，在每次合并数组时计算逆序对
 */

public class InversePairs {
    static final int VALUE = 1000000007;
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0) {
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        int count = InversePairsCore(array,copy,0,array.length - 1);
        return count;
    }
    private int InversePairsCore(int[] array, int[] copy, int low, int high) {
        if(low == high) {
            return 0;
        }
        int mid = (low + high) >> 1;
        int leftCount = InversePairsCore(array,copy,low,mid) % VALUE;
        int rightCount = InversePairsCore(array,copy,mid + 1,high);
        int count = 0;
        int i = mid;
        int j = high;
        int locCopy = high;
        while(i >= low && j > mid) {
            if(array[i] > array[j]) {
                count += j - mid;
                copy[locCopy--] = array[i--];
                if(count >= VALUE) count %= VALUE;
            } else {
                copy[locCopy--] = array[j--];
            }
        }
        for(; i >= low; i--){
            copy[locCopy--] = array[i];
        }
        for(; j > mid; j--) {
            copy[locCopy--] = array[j];
        }
        for(int s = low; s <= high; s++) {
            array[s] = copy[s];
        }
        return (leftCount + rightCount + count) % VALUE;
    }
}
