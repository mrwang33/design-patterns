package wang.ggblog.singleton;

/**
 * @author wanghuan
 */
public enum EnumSingleton {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            new Thread(() -> {
                EnumSingleton instance = EnumSingleton.INSTANCE;
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
