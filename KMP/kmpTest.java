//package KMP;
//
///**
// * 熟悉kmp算法
// */
//public class kmpTest {
//    /**
//     * 先将待匹配的字符串str2生成一个最长匹配串数组
//     */
//    public static int[] getNetArray(char[] str2) {
//        if(str2.length == 1) {
//            return  new int[] {-1};
//        }
//        int[] next = new int[str2.length];
//        next[0] = -1;
//        next[1] = 0;
//        int i = 2; //当前字符的下标
//        int cn = 0; //前一个字符最长真前缀的后一个字符的下标
//        while(i < next.length) {
//            if(str2[i - 1] == str2[cn]) {
//                next[i++] = ++cn;
//            } else if(cn > 0) {
//                cn = next[cn];
//            } else {
//                next[i++] = 0;
//            }
//        }
//        return next;
//    }
//
//    /**
//     * 返回匹配上的位置
//     * @param str1
//     * @param str2
//     * @return
//     */
//    public static int getIndexOf(String str1, String str2) {
//        if(str1 == null || str2 == null || str2.length() < 1 || str1.length() < str2.length()) {
//            return -1;
//        }
//        char[] chars1 = str1.toCharArray();
//        char[] chars2 = str2.toCharArray();
//        int[] next = getNetArray(chars2);
//        int i1 = 0;
//        int i2 = 0;
//        while(i1 < chars1.length && i2 < chars2.length) {
//            if(chars1[i1] == chars2[i2]) {
//                i1++;
//                i2++;
//            } else if(next[i2] == -1) {
//                i1++;
//            } else {
//                i2 = next[i2];
//            }
//        }
//        return i2 == chars2.length ? i1 - i2 : -1;
//    }
//
//    public static void main(String[] args) {
//        String str = "ABCDABD";
//        char[] str1 = str.toCharArray();
//        int[] str2 = getNetArray(str1);
//        for(int i = 0; i < str2.length; i++) {
//            System.out.print(str2[i]);
//        }
//
//    }
//}
