package wang.ggblog.factory.simple;

import wang.ggblog.factory.Car;

/**
 * 简单工厂
 * @author wang1
 * @date 2018/7/11
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Car honda = new SimpleFactory().createCar("honda");
        honda.getName();
    }
}
