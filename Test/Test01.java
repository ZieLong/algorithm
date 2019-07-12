package Test;

public class Test01 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 20; i++) {
            sum += i;
            if(i % 4 == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}
