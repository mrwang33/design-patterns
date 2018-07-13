package wang.ggblog.delegate;

/**
 * 山姆费舍
 * @author wang1
 * @date 2018/7/13
 */
public class SamFisher implements Soldier {

    /**
     * 执行任务
     */
    @Override
    public void execute() {
        System.out.println("接受命令 开始执行");
    }
}
