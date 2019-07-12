package my.code.repository.study.design.pattern.strategy.java;

/**
 * @author djh on  2018/9/12 16:09
 * @E-Mail 1544579459@qq.com
 */
public class Context {

    int calculate(Strategy strategy, int distance) {
        return strategy.calculatePrice(distance);
    }

}
