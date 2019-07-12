package KMP;

/**关键点
 * 如何使用next_arr[]数组进行加速
 * 如何来求出next_arr[]数组
 */
public class kmp {
    public static int getIndexOf(String s, String m) {
        if(s == null || m == null || m.length() < 1 || s.length() < m.length()) {
            return -1;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = m.toCharArray();
        int[] next = getNextArray(str2);
        int i1 = 0;
        int i2 = 0;
        while(i1 < str1.length && i2 < str2.length) {
            if(str1[i1] == str2[i2]) {
                i1++;
                i2++;
            } else if (next[i2] == -1) {
                i1++;
            } else {
                i2 = next[i2];
            }
        }
        return i2 == str2.length ? i1 - i2 : -1;
    }
    public static int[] getNextArray(char[] str2) {
        if(str2.length == 1) {
            return new int[] { -1 };
        }
        int[] next = new int[str2.length];
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int cn = 0;
        while(i < next.length) {
            if(str2[i - 1] == str2[cn]) {
                next[i++] = ++cn;
            } else if(cn > 0) {
                cn = next[cn];
            } else {
                next[i++] = 0;
            }
        }
        return next;
    }
}
