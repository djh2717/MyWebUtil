package my.code.repository.study.design.pattern.template;

/**
 * @author djh on  2019/1/3 16:34
 * @E-Mail 1544579459@qq.com
 */
public class VegetableFry extends BaseFry {

    @Override
    void addFood() {
        System.out.println("添加青菜!");
    }

    @Override
    void addSeasoning() {
        System.out.println("加入酱油!");
    }
}
