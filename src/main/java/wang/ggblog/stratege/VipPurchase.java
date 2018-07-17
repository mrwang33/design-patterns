package wang.ggblog.stratege;

/**
 * vip人员计价器
 *
 * @author wang1
 * @date 2018/7/17
 */
public class VipPurchase implements Purchase {
    /**
     * vip人员计算总价
     *
     * @param unitPrice 单价
     * @param num       个数
     */
    @Override
    public void calculatePrice(int unitPrice, int num) {
        double summary = unitPrice * num * 0.8;
        System.out.println("总价为: " + summary);
    }
}
