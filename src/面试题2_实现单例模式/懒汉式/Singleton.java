package 面试题2_实现单例模式.懒汉式;

/**
 * @Author zjh
 * @Date 2019/02/26,15:54
 */
public class Singleton {

    private static Singleton instance = null;

    public synchronized static Singleton getInstance() {

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
