package Test;

public class Test05 {
    public static Test05 t1 = new Test05();
    {
        System.out.println("blockA");
    }
    static {
        System.out.println("blockB");
    }

    public static void main(String[] args) {
        Test05 t2 = new Test05();
    }
}
