package Sort;

/**
 * 堆，优先级队列
 * 可以解决几乎所有贪心策略
 */
public class HeapSort {
    public static void swap(int[] arr,int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /*
       将index放到堆里应该去的位置
       对一个范围数组的元素添加到大根堆里
     */
    public static void heapInsert(int[] arr,int index) {
        while(arr[index] > arr[(index - 1) / 2]) {
            swap(arr,index,(index -  1) / 2);
            index = (index - 1) /2;
        }
    }
    /*
    堆中元素变化后，调整元素位置，使之继续形成大根堆
     */
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while(heapSize > left) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left]
                    ? left + 1
                    : left;
            if (largest == index) {
                break;
            }
            swap(arr,largest,index); // largest != index
            index = largest;
            left = index * 2 + 1;
        }
    }

}
