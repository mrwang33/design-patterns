package wang.ggblog.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wang1
 * @date 2018/7/9
 */
public class AnimalProxy implements InvocationHandler {
    private Object animal;

    AnimalProxy(Object animal) {
        this.animal = animal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在对象调用之前的操作
        System.out.println("I am angry!");
        method.invoke(animal,args);

        System.out.println("I am tired");

        return null;
    }
}
