package Sword_Offer;

/**
 * 字符串转化成整数
 */
public class StrToInt {
    public static int StrToInt(String str) {
        if(str.length() > 32 || str.length() == 0) return 0;
        long num = 0;
        int len = str.length() - 1;
        for(int i = 1; i <= len; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num = num * 10 + (str.charAt(i) - '0');
            } else {
                return 0;
            }
        }
        if(str.charAt(0) == '+') {
            num = num;
        } else if (str.charAt(0) == '-') {
            num = 0 - num;
        } else if(str.charAt(0) <= '9' && str.charAt(0) >= '0'){
            num = num + (long)((str.charAt(0) - '0') * Math.pow((double) 10, (double) len));
        }
        if(num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)num;
        }
    }

    public static void main(String[] args) {
        String str = "12r123";
        System.out.println(StrToInt(str));
    }
}
