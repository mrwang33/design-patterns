package wang.ggblog.singleton;

/**
 * @author wang1
 * @date 2018/7/9
 */
public class SingletonInit {

    /**
     * 静态构造函数 防止被new
     */
    private SingletonInit() {

    }

    public SingletonInit getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 静态内部类 由jvm控制线程安全
     */
    private static class SingletonHolder {
        private static final SingletonInit INSTANCE = new SingletonInit();
    }
}
