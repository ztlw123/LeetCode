package 面试题2_实现单例模式.普通单例;

import 面试题2_实现单例模式.SingletonRunnable;

/**
 * @Author zjh
 * @Date 2019/02/26,15:36
 */
public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance(){

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public static void main(String[] args) {
        new Thread(new SingletonRunnable()).start();
        new Thread(new SingletonRunnable()).start();
        new Thread(new SingletonRunnable()).start();
        new Thread(new SingletonRunnable()).start();

    }
}
