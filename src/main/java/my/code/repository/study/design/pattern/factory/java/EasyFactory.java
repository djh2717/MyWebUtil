package my.code.repository.study.design.pattern.factory.java;

/**
 * @author djh on  2018/7/28 23:08
 * @E-Mail 1544579459@qq.com
 */
public class EasyFactory {
    public static BMW getBMWThree() {
        return new BMWThree();
    }

    public static BMW getBMWSix() {
        return new BMWSix();
    }
}
