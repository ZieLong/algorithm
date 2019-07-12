package Sword_Offer;
/**
 * 找出数组中和为Sum的两个元素，如果有多个元素，找出乘积最小的元素
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumSithSum(int[] array, int sum) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            map1.put(sum - array[i], array[i]);
            if(map1.containsKey(array[i])) {
                map2.put(array[i],sum - array[i]);
            }
        }
        int a = 0, b = 0, mul = Integer.MAX_VALUE;
        if(map2.isEmpty()) return list;
        for(Integer k : map2.keySet()) {
            if(map2.get(k) * k < mul){
                a = k > map2.get(k) ? map2.get(k) : k;
                b = sum - a;
                mul = a * b;
            }
        }
        list.add(a);
        list.add(b);
        return list;
    }
}
