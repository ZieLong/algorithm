package Sort;

public class QuicklySort {
    public static void swap(int[] arr, int i, int j) {
        int  temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] partion(int[] arr, int L, int R) {
        int less = L -1;
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr,++less,L++);
            } else if (arr[L] > arr[R]) {
                swap(arr,--more,L);
            } else {
                L++;
            }
        }
        swap(arr,more,R);
        return new int[] {less + 1, more - 1};
    }
    public static void quickSort(int[] arr, int L ,int R) {
        if(L < R) {
            swap(arr,L + (int) (Math.random() * (R - L + 1)),R); //随机选一个数与最后位置上的数做交换
            int [] p = partion(arr,L,R);
            quickSort(arr,L,p[0] - 1);
            quickSort(arr,p[1] + 1,R);
        }
    }
}
