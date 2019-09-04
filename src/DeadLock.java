/**
 * @Author zjh
 * @Date 2019/08/29,15:29
 */
public class DeadLock {
    public static String resource1 = "str1";
    public static String resource2 = "str2";

    public static void main(String[] args) throws Exception{
//        new Thread(new Lock1()).start();
//        new Thread(new Lock2()).start();
        System.out.println(test());
    }

    public static String test() {
        try {
            int a = 10/1;
            return "code1";
        }
        catch (Exception e) {
            System.out.println("hhh");
            return "code2";
        }
        finally {
            System.out.println("lll");
            return "code3";
        }
    }
}
    class Lock1 implements Runnable {
        @Override
        public void run() {
            System.out.println("lock1.....");
            while (true) {
                synchronized (DeadLock.resource1){
                    System.out.println("lock1_getSource1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (DeadLock.resource2) {
                        System.out.println("lock1_getSource2");
                    }
                }
            }
        }
    }

    class Lock2 implements Runnable {
        @Override
        public void run() {
            System.out.println("lock2.....");
            while (true) {
                synchronized (DeadLock.resource2){
                    System.out.println("lock2_getSource2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (DeadLock.resource1) {
                        System.out.println("lock2_getSource1");
                    }
                }
            }
        }
    }

