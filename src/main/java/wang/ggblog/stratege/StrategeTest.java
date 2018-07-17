package wang.ggblog.stratege;

/**
 * 策略模式每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。
 * 策略模式使得算法可以在不影响到客户端的情况下发生变化。
 * 策略模式是面向接口编程的一种具体实现。
 * (例如: 普通人员和vip人员计算价格时是不一样的，vip人员会有8折)
 *
 * @author wang1
 * @date 2018/7/17
 */
public class StrategeTest {

    public static void main(String[] args) {
        Purchase purchase = new GeneralPurchase();
        Purchase vipPurchase = new VipPurchase();

        purchase.calculatePrice(10,10);
        vipPurchase.calculatePrice(10,10);
    }
}
