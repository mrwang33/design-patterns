package wang.ggblog.proxy;

import java.lang.reflect.Proxy;

/**
 * @author wang1
 * @date 2018/7/9
 */
public class ProxyTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        AnimalProxy animalProxy = new AnimalProxy(dog);


        Animal proxyInstance = (Animal)Proxy.newProxyInstance(dog.getClass().getClassLoader(), dog.getClass().getInterfaces(), animalProxy);

        proxyInstance.roar();
    }
}
