package Sort;

public class Partion01 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] Solution(int[] arr, int L, int R, int num) {
        int less = L - 1;
        int more = R;
        int cur = L;
        while( cur < more) {
            if(arr[cur] < num) {
                swap(arr,++less,cur++);
            }else if(arr[cur] > num) {
                swap(arr,--more,cur);
            }else {
                cur++;
            }
        }
        return new int[] {less + 1,more - 1};
    }
}
