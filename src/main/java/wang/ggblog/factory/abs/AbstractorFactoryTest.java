package wang.ggblog.factory.abs;

/**
 * @author wang1
 * @date 2018/7/11
 */
public class AbstractorFactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new DefaultFactory();
        factory.createCar("toyota").getName();
    }
}
