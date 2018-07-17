package wang.ggblog.pototype;

/**
 * 原型模式通过给出一个原型对象来指明所有创建的对象的类型，
 * 然后用复制这个原型对象的办法创建出更多同类型的对象。这就是原型模式的用意
 * (主要是实现Cloneable接口)
 * 克隆分为浅克隆和深克隆
 * 浅克隆是默认的实现 只克隆8大基本类型和String类型，其他类型只复制内存地址
 * 深克隆需要重写clone方法，通过序列化clone所有类型
 *
 * @author wang1
 * @date 2018/7/17
 */
public class PototypeTest {

    public static void main(String[] args) throws Exception {
        Naruto naruto = new Naruto("naruto", 175, 500);
        System.out.println(naruto);
        Naruto shadowCopy = (Naruto) naruto.clone();
        System.out.println(shadowCopy);
        boolean x = naruto == shadowCopy;
        System.out.println("分身是否是本体: " + x);
    }
}
