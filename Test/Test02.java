package Test;
/**
 * 静态方法里不能直接调用非静态属性
 */
public class Test02 {
    int a =2;

    public static void main(String[] args) {
        //System.out.println(a);
        System.out.println(new Test02().a);
    }
}
