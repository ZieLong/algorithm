package Sword_Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *数组中最小的k个数
 */
public class GetLeastNumbers_Solution {
    /**
     * 全排序的做法
     */
//    public ArrayList<Integer> GetLeastNumber_Solution(int[] input, int k) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        if(k > input.length || input.length <= 0) {
//            return arrayList;
//        }else {
//
//        Arrays.sort(input);
//
//        for(int i = 0; i < k; i++) {
//            arrayList.add(input[i]);
//        }
//        return arrayList;
//        }
//    }
    /**
     * 快排思想partition
     */
//    public ArrayList<Integer> GetLeastNumber_Solution(int[] input, int k) {
//        ArrayList<Integer> leastNumbers = new ArrayList<>();
//        if(input == null || k <= 0 || k > input.length) return leastNumbers;
//        int start = 0;
//        int end = input.length - 1;
//        int index = partition(input,start,end);
//        while(index != k - 1) {
//            if(index < k - 1) {
//                start = index + 1;
//                index = partition(input,start,end);
//            }else {
//                end = index - 1;
//                index = partition(input,start,end);
//            }
//        }
//        for(int i = 0; i < k; k++) {
//            leastNumbers.add(input[i]);
//        }
//        return leastNumbers;
//    }
//    private int partition(int[] arr,int start,int end) {
//        int pivotKey = arr[start];
//        while(start < end) {
//            while(start < end && arr[end] >= pivotKey) end--;
//            swap(arr,start,end);
//            while(start < end && arr[start] <= pivotKey) start++;
//            swap(arr,start,end);
//        }
//        return start;
//    }
//    private void swap(int[] arr, int a, int b) {
//        int tmp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = tmp;
//    }
    /**
     * 堆排序思想，优先级队列，使用最多的找出TopK
     */
    public ArrayList<Integer> GetLeastNumber_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = input.length;
        if(k > input.length || k <= 0) return result;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i = 0; i < length; i++) {
            if(maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            }else if(maxHeap.peek() > input[i]) {
                maxHeap.offer(input[i]);
            }
        }
        for(Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }
}
