package wang.ggblog.factory.abs;

import wang.ggblog.factory.Car;

/**
 * @author wang1
 * @date 2018/7/11
 */
public class DefaultFactory extends AbstractorFactory {
    @Override
    public Car createCar() {
        return new HondaFactory().createCar();
    }
}
