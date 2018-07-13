package wang.ggblog.factory.abs;

import wang.ggblog.factory.Car;

/**
 * @author wang1
 * @date 2018/7/11
 */
public abstract class AbstractFactory {

    public abstract Car createCar();

    // 这里属于配置 具体的业务实现在相应的工厂类里面
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
