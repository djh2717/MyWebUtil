package my.code.repository.study.design.pattern.decorator.java;

/**
 * @author djh on  2018/10/2 20:35
 * @E-Mail 1544579459@qq.com
 */
class DecorateA extends BaseDecorate {

    DecorateA(BaseComponent baseComponent) {
        super(baseComponent);
    }

    @Override
    void operator() {
        decorateMethod();
        super.operator();
    }

    private void decorateMethod() {
        System.out.println("装饰行为!");
    }
}


