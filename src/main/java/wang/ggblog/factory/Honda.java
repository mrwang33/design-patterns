package wang.ggblog.factory;

/**
 * @author wang1
 * @date 2018/7/11
 */
public class Honda implements Car {
    @Override
    public void getName() {
        System.out.println("本田");
    }
}
