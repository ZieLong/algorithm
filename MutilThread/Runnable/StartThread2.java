package MutilThread.Runnable;

/**
 * 创建线程方式二
 * 1.创建。实现runnable+重写run
 * 启动：创建实现类对象+Thread对象 + start
 *
 * 推荐：避免单继承的局限性，优先使用接口
 * 方便资源共享
 */
public class StartThread2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("coding");
        }
    }

    public static void main(String[] args) {
//        StartThread2 startThread2 = new StartThread2();
//        Thread thread = new Thread(startThread2);
//        thread.start();
        new Thread(new StartThread2()).start();
        for(int i = 0; i < 100; i++) {
            System.out.println("music");
        }
    }
}
