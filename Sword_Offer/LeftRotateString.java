package Sword_Offer;

/**
 * 循环左移字符串
 */
public class LeftRotateString {
    public static String LeftRotateString(String str, int n) {
        if(str.length() <= 0) return "";
        n = n % str.length();
        StringBuilder stringBuilder = new StringBuilder();
        String str1 = str.substring(0,n);
        String str2 = str.substring(n, str.length());
        stringBuilder = stringBuilder.append(str2).append(str1);
        return stringBuilder.toString();
    }

}
