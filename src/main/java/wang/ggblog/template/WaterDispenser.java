package wang.ggblog.template;

/**
 * @author wang1
 * @date 2018/7/17
 */
public abstract class WaterDispenser {


    public final void makeDrink() {
        //1,烧热水
        boilWater();
        //2,冲泡
        brew();
        //3,加调料
        addSeasoning();
    }

    public final void boilWater() {
        System.out.println("烧水，烧开停止");
    }

    /**
     * 冲泡
     */
    abstract void brew();

    /**
     * 加调料
     */
    abstract void addSeasoning();


}
