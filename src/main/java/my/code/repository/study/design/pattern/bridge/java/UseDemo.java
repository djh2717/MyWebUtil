package my.code.repository.study.design.pattern.bridge.java;

import my.code.repository.study.design.pattern.bridge.java.additive.MilkAdditive;
import my.code.repository.study.design.pattern.bridge.java.additive.SugarAdditive;
import my.code.repository.study.design.pattern.bridge.java.coffee.LargeCoffee;
import my.code.repository.study.design.pattern.bridge.java.coffee.SmallCoffee;

/**
 * 桥接模式: 关键字 "桥".
 * <p>
 * 此模式用于当系统中存在多个变换的维度, 我们可以把这些维度独立的抽象出来,让其分别变换而不相互影响
 * 然后在一个维度的抽象层持有另外一个维度的引用, 通过这个引用来把这两个维度关联起来, 就好像桥一样.
 *
 * @author djh on  2018/9/25 14:24
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {

        LargeCoffee largeCoffee = new LargeCoffee(new MilkAdditive());
        System.out.print("卖出一杯");
        largeCoffee.showCoffeeInfo();

        LargeCoffee largeCoffee2 = new LargeCoffee(new SugarAdditive());
        System.out.print("卖出一杯");
        largeCoffee2.showCoffeeInfo();

        SmallCoffee smallCoffee = new SmallCoffee(new MilkAdditive());
        System.out.print("卖出一杯");
        smallCoffee.showCoffeeInfo();

        SmallCoffee smallCoffee2 = new SmallCoffee(new SugarAdditive());
        System.out.print("卖出一杯");
        smallCoffee2.showCoffeeInfo();
    }
}
