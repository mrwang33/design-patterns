package wang.ggblog.factory.simple;

import wang.ggblog.factory.Car;
import wang.ggblog.factory.Honda;
import wang.ggblog.factory.Toyota;

/**
 * @author wang1
 * @date 2018/7/11
 */
public class SimpleFactory {

    public Car createCar(String name) {
        if ("Honda".equalsIgnoreCase(name)) {
            return new Honda();
          } else if ("Toyota".equalsIgnoreCase(name)) {
            return new Toyota();
        } else {
            return null;
        }
    }
}
