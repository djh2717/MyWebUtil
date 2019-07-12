package my.code.repository.study.design.pattern.decorator.java;

/**
 * @author djh on  2018/10/2 20:34
 * @E-Mail 1544579459@qq.com
 */
abstract class BaseDecorate extends BaseComponent {

    private BaseComponent mBaseComponent;

    BaseDecorate(BaseComponent baseComponent) {
        mBaseComponent = baseComponent;
    }

    @Override
    void operator() {
        mBaseComponent.operator();
    }
}
