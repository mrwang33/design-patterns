package wang.ggblog.factory.func;

/**
 * @author wang1
 * @date 2018/7/11
 */
public class FuncFactoryTest {

    public static void main(String[] args) {
        Factory carFactory = new HondaFactory();
        carFactory.createCar().getName();
    }
}
