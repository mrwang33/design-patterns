package wang.ggblog.factory.func;

import wang.ggblog.factory.Car;
import wang.ggblog.factory.Honda;

/**
 * @author wang1
 * @date 2018/7/11
 */
public class HondaFactory implements Factory {
    @Override
    public Car createCar() {
        return new Honda();
    }
}
