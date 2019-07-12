package Sort;

/**
 * 荷兰国旗
 */
public class Partion {
    public int[] Solution(int[] arr, int L, int R, int num) {

        int less = L - 1;
        int more = R;
        while( L < more) {
            if(arr[L] < num) {
                swap(arr,++less,L++); // 注意这一句，L++是先和L位置交换，然后L再自增
            } else if(arr[L] > num) {
                swap(arr,more--,L);
            } else {
                L++;
            }
        }
        return new int[] {less + 1, more - 1}; // 返回等于区域

    }
    public static void swap(int[] arr, int i, int j) {
        int  temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
