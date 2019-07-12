package Sword_Offer;

/**
 * 统计一个数字在排序数组中出现的次数
 */

public class getNumberOfK {
    public static int getNumberOfK(int[] array, int k) {
        if(array.length == 0) return -1;
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        int loc = -1;
        int count = 0;
        while(left <= right) {
            if(array[mid] == k) {
                loc = mid;
                break;
            }else if(array[mid] > k) {
                right = mid - 1;
                mid = (left + right) / 2;
            }else if (array[mid] < k) {
                left = mid + 1;
                mid = (left + right) / 2;
            }
        }
        if(loc == -1) {
            return 0;
        } else {
            for(int i = loc; i < array.length; i++) {
                if(array[i] == k) {
                    count++;
                }else {
                    break;
                }
            }
            for(int i = loc - 1; i >= 0; i--) {
                if(array[i] == k) {
                    count++;
                }else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,4,5,5,7,8};
        System.out.println(getNumberOfK(arr,1));
    }
}
