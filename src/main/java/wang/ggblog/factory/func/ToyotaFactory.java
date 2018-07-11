package wang.ggblog.factory.func;

import wang.ggblog.factory.Car;
import wang.ggblog.factory.Toyota;

/**
 * @author wang1
 * @date 2018/7/11
 */
public class ToyotaFactory implements Factory {
    @Override
    public Car createCar() {
        return new Toyota();
    }
}
