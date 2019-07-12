package Sword_Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 递归的交换数组中元素的位置实现全排列
 */
public class Permutation01 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if(str != null && str.length() > 0) {
            Permutationhelp(str.toCharArray(),0,arrayList);
            Collections.sort(arrayList);
        }
        return arrayList;
    }
    public void Permutationhelp(char[] chars, int begin,ArrayList<String> list) {
        if(begin == chars.length - 1) {
            list.add(String.valueOf(chars));
        } else {
            Set<Character> characters = new HashSet<>();
            for(int j = begin; j < chars.length; j++) {
                if(j == begin || !characters.contains(chars[j])) {
                    characters.add(chars[j]);
                    swap(chars,begin,j);
                    Permutationhelp(chars,begin + 1,list);
                    swap(chars,j,begin);
                }
            }
        }
    }
    public void swap(char[] chars, int a, int b) {
        char t = chars[a];
        chars[a] =  chars[b];
        chars[b] = t;
    }
}
