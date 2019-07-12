package Test;

public class Test07 {
    public static void main(String[] args) {
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);

        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i04 == i02);
        System.out.println(i04 == i01);

        System.out.println(System.identityHashCode(i01));
        System.out.println(System.identityHashCode(i02));
        System.out.println(System.identityHashCode(i03));
        System.out.println(System.identityHashCode(i04));

    }
}
