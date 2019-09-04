package 面试题2_实现单例模式;


import 面试题2_实现单例模式.懒汉式.Singleton;

/**
 * @Author zjh
 * @Date 2019/02/26,15:46
 */
public class SingletonRunnable implements Runnable {

    @Override
    public void run() {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
    }
}
