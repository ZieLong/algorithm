package Test;

public class Test11 {
    public static void main(String[] args) {
        System.out.println("return " + get());
    }
    public static int get() {
        try {
            return 0;
        }finally {
            return 1;
        }
    }
}
