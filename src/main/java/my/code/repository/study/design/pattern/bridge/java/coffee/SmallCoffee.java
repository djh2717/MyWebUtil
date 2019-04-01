package my.code.repository.study.design.pattern.bridge.java.coffee;

import my.code.repository.study.design.pattern.bridge.java.additive.BaseAdditive;

/**
 * @author djh on  2018/9/25 14:16
 * @E-Mail 1544579459@qq.com
 */
public class SmallCoffee extends BaseCoffee {

    public SmallCoffee(BaseAdditive baseAdditive) {
        super(baseAdditive);
    }

    @Override
    public void showCoffeeInfo() {
        System.out.println("中杯加 " + mBaseAdditive.toString() + " 咖啡");
    }
}
