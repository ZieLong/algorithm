package Sword_Offer;

public class NumberOf1BetweenAndN_Solution {
    public static int NumberOfBetween1andN_Solution(int n) {
        String str;
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            str = Integer.toString(i);
            if(str.contains("1")){
                char[] chars = str.toCharArray();
                for(int j = 0; j < chars.length; j++) {
                    if(chars[j] == '1') {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

//    public int NumberOfBetween1AndN_Solution(int n) {
//        int count = 0;
//        int i = 1;
//        int current = 0, after = 0, before = 0;
//        while((n / i) != 0) {
//
//        }
//    }
}
