package CMBC;

/**
 * 计算出数组连续子集的最大和
 */
public class Test {
    public static int getMaxSum(int[] array) {
        int sum = Integer.MIN_VALUE;
        int cursum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(cursum < 0) {
                cursum = array[i];
            } else {
                cursum += array[i];
            }
            sum = sum > cursum ? sum : cursum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {-5,4,6,2,8,-10,5,6,-4,7};
        System.out.println(getMaxSum(arr));
    }
}
