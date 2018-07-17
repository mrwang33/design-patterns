package wang.ggblog.stratege;

/**
 * 普通人员计价器
 * @author wang1
 * @date 2018/7/17
 */
public class GeneralPurchase implements Purchase {
    /**
     * 普通人员计算总价
     *
     * @param unitPrice 单价
     * @param num       个数
     */
    @Override
    public void calculatePrice(int unitPrice, int num) {
        int summary = unitPrice * num;
        System.out.println("总价为: "+ summary);
    }
}
