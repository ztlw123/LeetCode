package 面试题2_实现单例模式.静态内部类;

/**
 * @Author zjh
 * @Date 2019/02/26,17:15
 */
public class
Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() { return SingletonHolder.instance; }
}
