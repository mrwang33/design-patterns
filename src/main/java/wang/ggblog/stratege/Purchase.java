package wang.ggblog.stratege;

/**
 * 购买接口
 * @author wang1
 * @date 2018/7/17
 */
public interface Purchase {

    /**
     * 计算总价
     * @param unitPrice 单价
     * @param num 个数
     */
    void calculatePrice(int unitPrice,int num);
}
