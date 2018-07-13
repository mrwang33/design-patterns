package wang.ggblog.delegate;

/**
 * @author wang1
 * @date 2018/7/13
 */
public class Commander implements Soldier {
    private Soldier soldier = new SamFisher();

    /**
     * 执行任务
     */
    @Override
    public void execute() {
        soldier.execute();
    }
}
