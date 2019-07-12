package Sword_Offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个字符串中找到第一个只出一次的字符，如果没有就返回-1
 */
public class FirstNotRepeatingChar {
    /*
    我的方法使用hashSet
     */
    public static int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            if(hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i),10000);
            }else {
                hashMap.put(str.charAt(i),i);
            }
        }
        if(hashMap.isEmpty()){
            return -1;
        }

        int res = Integer.MAX_VALUE;
        for(Character c : hashMap.keySet()) {
            if(hashMap.get(c) < res) {
                System.out.println(c + "-->" + hashMap.get(c));
                res = hashMap.get(c);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "googgle";
        System.out.println(FirstNotRepeatingChar(s));
    }


}
