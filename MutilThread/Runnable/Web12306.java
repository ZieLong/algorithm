package MutilThread.Runnable;

/**
 * 共享资源
 */
public class Web12306 implements Runnable{
    private int ticketNums = 99;

    @Override
    public void run() {
        while(true) {
            if(ticketNums < 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
        }
    }

    public static void main(String[] args) {
        //一份资源
        Web12306 web12306 = new Web12306();
        //多个代理
        new Thread(web12306,"coder1").start();
        new Thread(web12306,"coder2").start();
        new Thread(web12306,"coder3").start();
    }
}
