package wang.ggblog.template;

/**
 * @author wang1
 * @date 2018/7/17
 */
public class Tea extends WaterDispenser {
    /**
     * 冲泡
     */
    @Override
    void brew() {
        System.out.println("加入茶叶");
    }

    /**
     * 加调料
     */
    @Override
    void addSeasoning() {
        System.out.println("什么也不加");
    }
}
