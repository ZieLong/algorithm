package Sword_Offer;

/**
 * 翻转单词顺序
 */
public class ReverseSentence {
    public static String ReverseSentence(String str) {
        if(str.length() == 0 || str.trim().length() == 0) return str;
        String[] strings = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = strings.length - 1; i >0; i--) {
            stringBuilder.append(strings[i]).append(" ");
        }
        stringBuilder.append(strings[0]);
        return stringBuilder.toString();
    }

}
