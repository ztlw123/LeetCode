package 面试题2_实现单例模式.饿汉式;

/**
 * @Author zjh
 * @Date 2019/02/26,17:04
 */
public class Singleton {

    private Singleton() {

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

}
