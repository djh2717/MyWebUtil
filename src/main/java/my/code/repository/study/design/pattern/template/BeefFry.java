package my.code.repository.study.design.pattern.template;

/**
 * @author djh on  2019/1/3 16:33
 * @E-Mail 1544579459@qq.com
 */
public class BeefFry extends BaseFry {
    @Override
    void addFood() {
        System.out.println("添加牛肉!");
    }

    @Override
    void addSeasoning() {
        System.out.println("加入小米椒!");
    }
}
