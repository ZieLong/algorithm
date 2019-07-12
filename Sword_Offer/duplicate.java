package Sword_Offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 找到第一个重复的
 */
public class duplicate {
    public boolean duplicate(int[] numbers, int length, int[] duplication) {
        if(length <= 1) return false;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < length; i++) {
            if(set.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                set.add(numbers[i]);
            }
        }
        return false;
    }
}
