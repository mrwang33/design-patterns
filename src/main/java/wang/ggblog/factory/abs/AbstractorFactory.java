package wang.ggblog.factory.abs;

import wang.ggblog.factory.Car;
import wang.ggblog.factory.Honda;
import wang.ggblog.factory.Toyota;

/**
 * @author wang1
 * @date 2018/7/11
 */
public abstract class AbstractorFactory {

    public abstract Car createCar();

    // 这里属于配置 具体的业务实现在相应的工厂内里面
    public Car createCar(String name) {
        if ("Honda".equalsIgnoreCase(name)) {
            return new HondaFactory().createCar();
        } else if ("Toyota".equalsIgnoreCase(name)) {
            return new ToyotaFactory().createCar();
        } else {
            return null;
        }
    }

}
