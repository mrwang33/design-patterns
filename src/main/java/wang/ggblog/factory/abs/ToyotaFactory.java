package wang.ggblog.factory.abs;

import wang.ggblog.factory.Car;
import wang.ggblog.factory.Toyota;

/**
 * @author wang1
 * @date 2018/7/11
 */
public class ToyotaFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        // 做出相应配置的操作
        return new Toyota();
    }
}
