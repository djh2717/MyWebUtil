package my.code.repository.study.design.pattern.decorator.java;

/**
 * @author djh on  2018/10/2 20:49
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        BaseDecorate decorateA = new DecorateA(concreteComponent);
        decorateA.operator();
    }
}
