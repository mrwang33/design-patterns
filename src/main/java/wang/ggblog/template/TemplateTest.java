package wang.ggblog.template;

/**
 * 模板模式将一套固定的模板封装在一个抽象类中，具体的实现细节由子类去完成
 * 常见的模板模式的应用
 * JDBC
 * jdbc将 注册驱动 获取连接 执行sql语句 获取结果集 封装成一个模板 由相关驱动和用户自己实现细节
 *
 * @author wang1
 * @date 2018/7/17
 */
public class TemplateTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.makeDrink();
        tea.makeDrink();
    }
}
