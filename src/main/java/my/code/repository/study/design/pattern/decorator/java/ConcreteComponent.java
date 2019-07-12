package my.code.repository.study.design.pattern.decorator.java;

/**
 * @author djh on  2018/10/2 20:33
 * @E-Mail 1544579459@qq.com
 */
class ConcreteComponent extends BaseComponent {
    @Override
    void operator() {
        System.out.println("基础行为!");
    }
}
