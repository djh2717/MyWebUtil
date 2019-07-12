package my.code.repository.study.design.pattern.template;

/**
 * @author djh on  2019/1/3 16:36
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        BaseFry beefFry = new BeefFry();
        beefFry.cookProcess();

        BaseFry vegetableFry = new VegetableFry();
        vegetableFry.cookProcess();
    }
}
