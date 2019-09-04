package 面试题2_实现单例模式.懒汉式;

/**
 * @Author zjh
 * @Date 2019/02/26,16:10
 */
public class BetterSingleton {

    private volatile static BetterSingleton instance = null;

    public static BetterSingleton getInstance() {
        if(instance == null) {
            synchronized (BetterSingleton.class) {
                if(instance == null) {
                    instance = new BetterSingleton();
                }
            }
        }

        return instance;
    }
}
