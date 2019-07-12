package MutilThread.GaoBingFa;

public class MutilThreadLong {
    public static long t = 0;
    public static class changeT implements Runnable {
        private long to;
        public changeT(long to) {
            this.to = to;
        }

        @Override
        public void run() {
            while(true) {
                MutilThreadLong.t = to;
                Thread.yield();
            }
        }
    }

    public static class ReadT implements Runnable {

        @Override
        public void run() {
            while(true) {
                long tmp = MutilThreadLong.t;
                if(tmp != 111L && tmp != -999L && tmp != 333L & tmp != -444L) {
                    System.out.println(tmp);
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new changeT(111L)).start();
        new Thread(new changeT(-999L)).start();
        new Thread(new changeT(333L)).start();
        new Thread(new changeT(-444L)).start();
        new Thread(new ReadT()).start();
    }
}
