package my.code.repository.study.design.pattern.strategy.java;

/**
 * @author djh on  2018/9/12 16:12
 * @E-Mail 1544579459@qq.com
 */
public class TaxiPrice implements Strategy {
    @Override
    public int calculatePrice(int distance) {
        if (distance < 10) {
            return 10;
        } else {
            return (int) (distance + (distance-10) * 0.5f);
        }
    }
}
