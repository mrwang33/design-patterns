package wang.ggblog.singleton;

/**
 * @author wanghuan
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new DoubleCheckSingleton();
                }
                return instance;
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            new Thread(() -> {
                DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
