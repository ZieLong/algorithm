package Sword_Offer;

public class TheNumberOf1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int input = n;
//        if(n < 0) n = 0 - n;
//        int res = 0;
//        while(n != 0) {
//            if(n % 2 == 1) {
//                res++;
//            }
//           n =  n >> 1;
//        }
//        if(input > 0) {
//            System.out.println(res);
//        }else {
//            System.out.println(res + 1);
//        }
//    }
    /**
     * 最优解
     */
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
