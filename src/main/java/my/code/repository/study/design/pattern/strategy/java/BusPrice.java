package my.code.repository.study.design.pattern.strategy.java;

/**
 * @author djh on  2018/9/12 16:11
 * @E-Mail 1544579459@qq.com
 */
public class BusPrice implements Strategy {

    @Override
    public int calculatePrice(int distance) {
        if (distance < 10) {
            return 1;
        } else {
            return 1 + Math.round((distance - 10) / 5.0f);
        }
    }
}
