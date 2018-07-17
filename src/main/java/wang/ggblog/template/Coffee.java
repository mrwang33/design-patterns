package wang.ggblog.template;

/**
 * @author wang1
 * @date 2018/7/17
 */
public class Coffee extends WaterDispenser {
    /**
     * 冲泡
     */
    @Override
    void brew() {
        System.out.println("加入coffee冲剂");
    }

    /**
     * 加调料
     */
    @Override
    void addSeasoning() {
        System.out.println("加糖");
    }
}
