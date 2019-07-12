package Sword_Offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 找到数组中数量超过数组长度一半的元素
 */
public class MoreThanHalfNum {
    public static int MoreThanHalfNum_Solution(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = 0;
        for(int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            } else {
                map.put(array[i],map.get(array[i]) + 1);
            }
            len++;
        }
        int res = 0;
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue() > (len / 2)) res = entry.getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
