package Sword_Offer;

/**
 * 把数组排成最小的数
 *
 */
public class PrintMinNumber {
    /*
    选择排序思想
     */
//    public String PrintMinNumber(int[] numbers) {
//        StringBuilder stringBuilder = new StringBuilder();
//        String pre,last;
//        int temp;
//        for(int i = 0; i < numbers.length; i++) {
//            for(int j = i + 1; j < numbers.length; j++) {
//                pre = numbers[i] + "" + numbers[j];
//                last = numbers[j] + "" + numbers[i];
//                if(pre.compareTo(last) > 0) {
//                    temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//            stringBuilder.append(numbers[i]);
//        }
//        return stringBuilder.toString();
//    }
    public static String PrintMinNumber(int[] numbers) {
        String pre, last;
        StringBuilder stringBuilder = new StringBuilder();
        int temp;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = numbers.length - 1; j > i; j--) {
                pre = numbers[j] + "" + numbers[j - 1];
                last = numbers[j - 1] + "" + numbers[j];
                if(pre.compareTo(last) < 0) {
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
            stringBuilder.append(numbers[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int[] a = {3,5,2,4,1};
        System.out.println(PrintMinNumber(a));
    }

}
