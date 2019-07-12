package my.code.repository.study.design.pattern.bridge.java.coffee;

import my.code.repository.study.design.pattern.bridge.java.additive.BaseAdditive;

/**
 * @author djh on  2018/9/25 14:10
 * @E-Mail 1544579459@qq.com
 */
abstract class BaseCoffee {
    BaseAdditive mBaseAdditive;

    BaseCoffee(BaseAdditive baseAdditive) {
        mBaseAdditive = baseAdditive;
    }

    abstract void showCoffeeInfo();
}
