package my.code.repository.study.design.pattern.factory.java;

/**
 * factory pattern: key words "factory".
 * <p>
 * This patter use to build a object for client, and the client do not need know the
 * construction details.
 *
 * @author djh on  2018/7/28 23:09
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        BMW bmwThree = EasyFactory.getBMWThree();
        BMW bmwSix = EasyFactory.getBMWSix();

        bmwThree.speak();
        bmwSix.speak();
    }
}
